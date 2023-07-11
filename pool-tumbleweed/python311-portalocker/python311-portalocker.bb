SUMMARY = "Locking library for Python"
DESCRIPTION = "Portalocker is a library to provide an API to file locking. \
 \
On Linux and Unix systems, the locks are advisory by default. By \
specifying the `-o mand` option to the mount command, it is possible \
to enable mandatory file locking on Linux. This is generally not \
recommended however."
LICENSE = "Python-2.0"

PV = "2.7.0"

RPM_NAME = "python311-portalocker-2.7.0-1.3.noarch.rpm"
RPM_HASH = "75583553309c087edadb9907d2fe72d46fdccc67138be19496a5eb915aa48c236f6dbedc44135e30fc4fbcee24e1d1329dac225c78d50f8c557a3bc63e5a8f5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-portalocker \
python3.11dist-portalocker \
python311-portalocker \
python3dist-portalocker"

RDEPENDS:${PN} += "python-abi"

inherit rpm
