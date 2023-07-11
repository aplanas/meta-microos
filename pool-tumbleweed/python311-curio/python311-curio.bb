SUMMARY = "Concurrent I/O library for Python 3"
DESCRIPTION = "Curio is a library for performing concurrent I/O with coroutines in Python 3."
LICENSE = "BSD-Source-Code"

PV = "1.6"

RPM_NAME = "python311-curio-1.6-3.3.noarch.rpm"
RPM_HASH = "fad0608969d93a126d165ede32827390258035b034e3349cc3c010b2eec7ce781a1d5cc81065670b9ea23c3e571d87e57388451b55c90049fc2bf63435e2bf50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-curio \
python3.11dist-curio \
python311-curio \
python3dist-curio"

RDEPENDS:${PN} += "python-abi"

inherit rpm
