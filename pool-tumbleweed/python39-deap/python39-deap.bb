SUMMARY = "Distributed Evolutionary Algorithms in Python"
DESCRIPTION = "DEAP is intended to be an easy to use distributed evolutionary algorithm \
library in the Python language. Its two main components are modular and \
can be used separately. The first module is a Distributed Task Manager \
(DTM), which is intended to run on cluster of computers. The second \
part is the Evolutionary Algorithms in Python (EAP) framework."
LICENSE = "LGPL-3.0-only"

PV = "1.3.1"

RPM_NAME = "python39-deap-1.3.1-4.6.aarch64.rpm"
RPM_HASH = "289f7057f448f59e2b1f5e9e4b92ffaa5da959990bc073a3e087c7f764d6fc45b5a3bde914428fb27e33d0dbd3e8d610d71bb15784cbe86c703f39a4940993ca"

RPROVIDES:${PN} += "python3.9dist(deap) \
python39-deap \
python39-deap(aarch-64) \
python3dist(deap)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
