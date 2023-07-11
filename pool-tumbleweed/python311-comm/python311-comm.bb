SUMMARY = "Jupyter Python Comm implementation"
DESCRIPTION = "Comm provides a way to register a Kernel Comm implementation, \
as per the Jupyter kernel protocol. It also provides a base \
Comm implementation and a default CommManager that can be used."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "python311-comm-0.1.3-1.3.noarch.rpm"
RPM_HASH = "1a1667c423780ebb3d5d85f3c6adb7ef0d883f3bf9107045149b3692b61d13a5fce4d9809316be9a3acd024b29fea5401eefdecec5f2d616d36c862daf3bc297"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-comm \
python3.11dist-comm \
python311-comm \
python3dist-comm"

RDEPENDS:${PN} += "python-abi \
python311-traitlets"

inherit rpm
