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

RPM_NAME = "python311-pyquil-3.5.2-1.3.noarch.rpm"
RPM_HASH = "f37369b21945c331944bfecf72352df45b90ed852460fd1374b75be1b356f95589e2a793cc8628d5ea65bdee8aa91cc68885123c53f42e795e1ad82bb2110632"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyquil \
python3.11dist-pyquil \
python311-pyquil \
python3dist-pyquil"

RDEPENDS:${PN} += "-python311-qcs-api-client >= 0.21 with python311-qcs-api-client < 0.22.0 \
python-abi \
python311-Deprecated \
python311-lark \
python311-networkx \
python311-numpy \
python311-rpcq \
python311-scipy \
python311-tenacity"

inherit rpm
