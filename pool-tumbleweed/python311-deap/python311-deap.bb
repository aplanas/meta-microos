SUMMARY = "Distributed Evolutionary Algorithms in Python"
DESCRIPTION = "DEAP is intended to be an easy to use distributed evolutionary algorithm \
library in the Python language. Its two main components are modular and \
can be used separately. The first module is a Distributed Task Manager \
(DTM), which is intended to run on cluster of computers. The second \
part is the Evolutionary Algorithms in Python (EAP) framework."
LICENSE = "LGPL-3.0-only"

PV = "1.3.1"

RPM_NAME = "python311-deap-1.3.1-4.6.aarch64.rpm"
RPM_HASH = "e93010b9007bc626e08b1953e5e12b9145ebcb6816806c9eb74e8d4fe48296955676e8f0906567aee13c95705f483c47d697499ea6252c19b0b2d59d99a9e43f"

RPROVIDES:${PN} += "python3.11dist(deap) \
python311-deap \
python311-deap(aarch-64) \
python3dist(deap)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
