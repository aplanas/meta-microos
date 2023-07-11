SUMMARY = "Jupyter Python Comm implementation"
DESCRIPTION = "Comm provides a way to register a Kernel Comm implementation, \
as per the Jupyter kernel protocol. It also provides a base \
Comm implementation and a default CommManager that can be used."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "python39-comm-0.1.3-1.3.noarch.rpm"
RPM_HASH = "e1a366a86ff7bb5f34ab56d5867b01dc2287739cb2fd0616f6ff3a57ce6e8171d5fdfe296625cdefb21f60eb28097758dcdd1b02f60d7023a2ce3674d5e5d497"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-comm \
python39-comm \
python3dist-comm"

RDEPENDS:${PN} += "python-abi \
python39-traitlets"

inherit rpm
