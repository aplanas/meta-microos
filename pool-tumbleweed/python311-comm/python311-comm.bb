SUMMARY = "Jupyter Python Comm implementation"
DESCRIPTION = "Comm provides a way to register a Kernel Comm implementation, \
as per the Jupyter kernel protocol. It also provides a base \
Comm implementation and a default CommManager that can be used."
LICENSE = "BSD-3-Clause"

PV = "0.1.4"

RPM_NAME = "python311-comm-0.1.4-1.1.noarch.rpm"
RPM_HASH = "7b486d14c343bb291406719663f853771f1bb28de4b032f4c3029bad3aa559a2e0f6f2da367d20683133ddf1a8b46bb33ad869645b56174986e661ec2fe135d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-comm \
python3.11dist-comm \
python311-comm \
python3dist-comm"

RDEPENDS:${PN} += "python-abi \
python311-traitlets"

inherit rpm
