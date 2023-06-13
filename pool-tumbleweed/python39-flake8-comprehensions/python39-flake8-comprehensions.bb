SUMMARY = "A flake8 plugin to help you write better list/set/dict comprehensions"
DESCRIPTION = "A flake8 plugin that helps you write better list/set/dict comprehensions."
LICENSE = "ISC"

PV = "3.12.0"

RPM_NAME = "python39-flake8-comprehensions-3.12.0-2.1.noarch.rpm"
RPM_HASH = "8f250c08a1987337af914a014351073d2a8586ae5fd4f90528cf068c26d1974d2f3f5cc634567c6eafd2867330642781e78a3e1c4cd0ee0311943da0d1df3d88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(flake8-comprehensions) \
python39-flake8-comprehensions \
python3dist(flake8-comprehensions)"

RDEPENDS:${PN} += "python(abi) \
python39-flake8"

inherit rpm
