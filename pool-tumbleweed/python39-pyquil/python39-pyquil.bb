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

RPM_NAME = "python39-pyquil-3.5.2-1.3.noarch.rpm"
RPM_HASH = "3b191380c640e11e22a0489da3a3811e1a330e9f18edc469af550c5da105b24e99d1bb57da9bcfb7af82dd9c2162dbb4531e682dccdc029bf7014bae2f7ba2f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyquil \
python39-pyquil \
python3dist-pyquil"

RDEPENDS:${PN} += "-python39-qcs-api-client >= 0.21 with python39-qcs-api-client < 0.22.0 \
python-abi \
python39-Deprecated \
python39-lark \
python39-networkx \
python39-numpy \
python39-rpcq \
python39-scipy \
python39-tenacity"

inherit rpm
