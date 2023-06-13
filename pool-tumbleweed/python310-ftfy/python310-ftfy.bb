SUMMARY = "Python module for repairing mis-decoded Unicode text"
DESCRIPTION = "Ftfy attempts to repair Unicode text that has been erroneously \
put through an encode/decode cycle with different encodings."
LICENSE = "MIT"

PV = "6.0.3"

RPM_NAME = "python310-ftfy-6.0.3-1.7.noarch.rpm"
RPM_HASH = "df91409b7968a9d04d94d5d0ddb33efff436e38071f5d535f1ab8e264db4d3677d1d5dff2496bf95d9fe6955484f680e6aaba5c38d48b8bb02fa7787e9858a4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ftfy \
python3.10dist(ftfy) \
python310-ftfy \
python3dist(ftfy)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-wcwidth \
update-alternatives"

inherit rpm
