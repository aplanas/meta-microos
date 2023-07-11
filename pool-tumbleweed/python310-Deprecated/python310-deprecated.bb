SUMMARY = "Python @deprecated decorator"
DESCRIPTION = "If you need to mark a function or a method as deprecated, \
you can use the ``@deprecated`` decorator."
LICENSE = "MIT"

PV = "1.2.14"

RPM_NAME = "python310-Deprecated-1.2.14-1.3.noarch.rpm"
RPM_HASH = "3f6396e90e0fa8dc3597ef2dd5e0bcad1bc55fe533552197e7edede097823e1db0d032e2f04c3bb780b7c4a79dfd9658888482e604b185419f0d2b36f9f56c24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-deprecated \
python310-Deprecated \
python310-deprecated \
python3dist-deprecated"

RDEPENDS:${PN} += "python-abi \
python310-wrapt"

inherit rpm
