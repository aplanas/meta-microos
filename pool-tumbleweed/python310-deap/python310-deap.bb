SUMMARY = "Distributed Evolutionary Algorithms in Python"
DESCRIPTION = "DEAP is intended to be an easy to use distributed evolutionary algorithm \
library in the Python language. Its two main components are modular and \
can be used separately. The first module is a Distributed Task Manager \
(DTM), which is intended to run on cluster of computers. The second \
part is the Evolutionary Algorithms in Python (EAP) framework."
LICENSE = "LGPL-3.0-only"

PV = "1.3.1"

RPM_NAME = "python310-deap-1.3.1-4.8.aarch64.rpm"
RPM_HASH = "45d472d77e8f286c5a7ac7ebd441ad61cd227d3b4e44130217c4a79d3e3718a3daea0d021a1c6fd418b19d8a37d057a663407011afb2f12f3f3ed1fffafd819b"

RPROVIDES:${PN} += "python3.10dist-deap \
python310-deap \
python3dist-deap"

RDEPENDS:${PN} += "python-abi"

inherit rpm
