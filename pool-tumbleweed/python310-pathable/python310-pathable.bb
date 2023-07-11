SUMMARY = "Object-oriented paths"
DESCRIPTION = "Python object-oriented paths."
LICENSE = "Apache-2.0"

PV = "0.4.3"

RPM_NAME = "python310-pathable-0.4.3-4.3.noarch.rpm"
RPM_HASH = "f252ad91cb31ed939a6e4db5ed53453c30c226ef6aec51633e5e47827a5684aff2abf9b160a7eb516bd8b6fd15b6bc6755bb5df4f8850b30c7c1bc754a42aa6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pathable \
python310-dictpath \
python310-pathable \
python3dist-pathable"

RDEPENDS:${PN} += "python-abi"

inherit rpm
