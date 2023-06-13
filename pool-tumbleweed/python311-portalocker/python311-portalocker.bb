SUMMARY = "Locking library for Python"
DESCRIPTION = "Portalocker is a library to provide an API to file locking. \
 \
On Linux and Unix systems, the locks are advisory by default. By \
specifying the `-o mand` option to the mount command, it is possible \
to enable mandatory file locking on Linux. This is generally not \
recommended however."
LICENSE = "Python-2.0"

PV = "2.7.0"

RPM_NAME = "python311-portalocker-2.7.0-1.1.noarch.rpm"
RPM_HASH = "bf206a89dd583dc235cdd1b82e0f5dff4133ec747f8cf696fb9a8ae5f13a7a75522c54bbeaff76aff96ea1861f0962fb991f062361951e821174e2afa4a077a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(portalocker) \
python311-portalocker \
python3dist(portalocker)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
