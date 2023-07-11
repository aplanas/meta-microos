SUMMARY = "Locking library for Python"
DESCRIPTION = "Portalocker is a library to provide an API to file locking. \
 \
On Linux and Unix systems, the locks are advisory by default. By \
specifying the `-o mand` option to the mount command, it is possible \
to enable mandatory file locking on Linux. This is generally not \
recommended however."
LICENSE = "Python-2.0"

PV = "2.7.0"

RPM_NAME = "python39-portalocker-2.7.0-1.3.noarch.rpm"
RPM_HASH = "d6fdad40a5a9bb4c5c68f437d384d33b912d1e27ab122bc00f70ece251a45dbbff0e8f38513767d0fa20a373bf96423b6a51635911bdae661100cfffe7e8f0c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-portalocker \
python39-portalocker \
python3dist-portalocker"

RDEPENDS:${PN} += "python-abi"

inherit rpm
