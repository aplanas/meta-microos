SUMMARY = "Appendable key-value storage"
DESCRIPTION = "Key-value byte store with appendable values \
 \
Partd stores key-value pairs. \
Values are raw bytes. \
We append on old values. \
 \
Partd excels at shuffling operations."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "python310-partd-1.3.0-1.5.noarch.rpm"
RPM_HASH = "aec3e8140e248c2714d53c529fe97950573f1bef558f64df9e10fc1e7ec60c1123d648b48a3c359bd84a139566339b6ac3d53ef4f6f88f92222c81646b759218"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-partd \
python310-partd \
python3dist-partd"

RDEPENDS:${PN} += "python-abi \
python310-locket \
python310-toolz"

inherit rpm
