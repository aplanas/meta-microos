SUMMARY = "System power status information in Python"
DESCRIPTION = "Python module that allows you to get power and battery status of the system."
LICENSE = "MIT"

PV = "1.4"

RPM_NAME = "python310-power-1.4-3.14.noarch.rpm"
RPM_HASH = "f3d3e68bf0687885803f432d951f2c9a6cd9f76b32c71cb4f436afe3b392834a3a79de92abe1ad15a01ebfd313ea6491c1a70d32035ddf9f08b441017c3c842a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-power \
python3.10dist(power) \
python310-power \
python3dist(power)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
