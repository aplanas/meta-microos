SUMMARY = "Locking library for Python"
DESCRIPTION = "Portalocker is a library to provide an API to file locking. \
 \
On Linux and Unix systems, the locks are advisory by default. By \
specifying the `-o mand` option to the mount command, it is possible \
to enable mandatory file locking on Linux. This is generally not \
recommended however."
LICENSE = "Python-2.0"

PV = "2.7.0"

RPM_NAME = "python310-portalocker-2.7.0-1.3.noarch.rpm"
RPM_HASH = "29a4b954f7d212cd3d2cdd915f19422c9f2a689e4702bf188bd566399a64559b3b9acdae927b1bd4241a085cc0e33e19f8a28213ba02c12f9c1db996768692b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-portalocker \
python310-portalocker \
python3dist-portalocker"

RDEPENDS:${PN} += "python-abi"

inherit rpm
