SUMMARY = "Distributed Evolutionary Algorithms in Python"
DESCRIPTION = "DEAP is intended to be an easy to use distributed evolutionary algorithm \
library in the Python language. Its two main components are modular and \
can be used separately. The first module is a Distributed Task Manager \
(DTM), which is intended to run on cluster of computers. The second \
part is the Evolutionary Algorithms in Python (EAP) framework."
LICENSE = "LGPL-3.0-only"

PV = "1.3.1"

RPM_NAME = "python39-deap-1.3.1-4.8.aarch64.rpm"
RPM_HASH = "3286223222dc34d9cfa193212128de07f3b584b4b8b2dbb797a0c85c94c269a2e6e5353c46e312f1bbac15b855bd14a51ce433edd597398d12eb4349be5c3a2f"

RPROVIDES:${PN} += "python3.9dist-deap \
python39-deap \
python3dist-deap"

RDEPENDS:${PN} += "python-abi"

inherit rpm
