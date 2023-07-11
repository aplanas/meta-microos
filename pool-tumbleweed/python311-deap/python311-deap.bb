SUMMARY = "Distributed Evolutionary Algorithms in Python"
DESCRIPTION = "DEAP is intended to be an easy to use distributed evolutionary algorithm \
library in the Python language. Its two main components are modular and \
can be used separately. The first module is a Distributed Task Manager \
(DTM), which is intended to run on cluster of computers. The second \
part is the Evolutionary Algorithms in Python (EAP) framework."
LICENSE = "LGPL-3.0-only"

PV = "1.3.1"

RPM_NAME = "python311-deap-1.3.1-4.8.aarch64.rpm"
RPM_HASH = "fecc2e009583255cbd9c2a5e0916c6da7d8c19c7cfe846a63b3c18f59d9e0bfde64d8af12d90e753cbc696de83a72a4370a29d4a4dca4f90ba37054a9aea37ed"

RPROVIDES:${PN} += "python3-deap \
python3.11dist-deap \
python311-deap \
python3dist-deap"

RDEPENDS:${PN} += "python-abi"

inherit rpm
