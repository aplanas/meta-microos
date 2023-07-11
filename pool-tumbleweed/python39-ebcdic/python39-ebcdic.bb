SUMMARY = "Additional EBCDIC codecs for Python"
DESCRIPTION = "Additional EBCDIC codecs for Python."
LICENSE = "BSD-2-Clause"

PV = "1.1.1"

RPM_NAME = "python39-ebcdic-1.1.1-2.10.noarch.rpm"
RPM_HASH = "6be6eda489b0c3bbd093593ccd0cb5af07f0814e8771b9e1ccce6c77dee549e82cadef99a847c41d4a72224e9a1e06cfdebecf15637f724146c26dae59920566"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ebcdic \
python39-ebcdic \
python3dist-ebcdic"

RDEPENDS:${PN} += "python-abi"

inherit rpm
