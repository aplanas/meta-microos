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

RPM_NAME = "python310-pyquil-3.5.2-1.1.noarch.rpm"
RPM_HASH = "96b610c474402f2b0cc9f71ce4968dcea7429cc458e8b85a040d1fd613eb22ef8c7f8eed293cc0a99402474d94eb2302e4b795c53f6b506034acd83786725388"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyquil \
python3.10dist-pyquil \
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
