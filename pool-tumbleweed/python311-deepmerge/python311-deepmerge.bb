SUMMARY = "A toolset to deeply merge python dictionaries"
DESCRIPTION = "Python module to deeply merge python dictionaries."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-deepmerge-1.1.0-1.1.noarch.rpm"
RPM_HASH = "60650ad81333aaf5d11279802e6802724462e71118b8596d251105d69ab2088aaaee53ff62b76c5c9e8ab459102bafbbb8f58b97ac4cceabf7086a0014378d9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-deepmerge \
python311-deepmerge \
python3dist-deepmerge"

RDEPENDS:${PN} += "python-abi"

inherit rpm
