SUMMARY = "Concurrent I/O library for Python 3"
DESCRIPTION = "Curio is a library for performing concurrent I/O with coroutines in Python 3."
LICENSE = "BSD-Source-Code"

PV = "1.6"

RPM_NAME = "python311-curio-1.6-3.1.noarch.rpm"
RPM_HASH = "61b1ba4f44cb7fc884891ffbc98e6b6eb0cd64ed3dcae35e41cea06eddca928861f7d7ddd376aae097e2031f1e06a7052f92c556c0706ad0edd457e3d65a6cb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-curio \
python311-curio \
python3dist-curio"

RDEPENDS:${PN} += "python-abi"

inherit rpm
