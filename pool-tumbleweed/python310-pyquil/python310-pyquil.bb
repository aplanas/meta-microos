SUMMARY = "A Python library to generate Quantum Instruction Language (Quil) Programs"
DESCRIPTION = "PyQuil is a Python library for quantum programming using Quil, \
the quantum instruction language developed at Rigetti Computing. \
PyQuil serves three main functions: \
  - Easily generating Quil programs from quantum gates and \
    classical operations \
  - Compiling and simulating Quil programs using the Quil \
    Compiler (quilc) and the Quantum Virtual Machine (QVM) \
  - Executing Quil programs on real quantum processors (QPUs) \
    using Quantum Cloud Services (QCS)"
LICENSE = "Apache-2.0"

PV = "3.5.2"

RPM_NAME = "python310-pyquil-3.5.2-1.3.noarch.rpm"
RPM_HASH = "06226767085f30daf5a50714adba95ef37ec43ef1f70dfa7ef87dc5318ccb0803f31881020331095155ce66585acc9d35cdd916fd71157fa78266c921bb85cd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyquil \
python310-pyquil \
python3dist-pyquil"

RDEPENDS:${PN} += "-python310-qcs-api-client >= 0.21 with python310-qcs-api-client < 0.22.0 \
python-abi \
python310-Deprecated \
python310-lark \
python310-networkx \
python310-numpy \
python310-rpcq \
python310-scipy \
python310-tenacity"

inherit rpm
