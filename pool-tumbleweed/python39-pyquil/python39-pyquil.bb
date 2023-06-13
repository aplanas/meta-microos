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

RPM_NAME = "python39-pyquil-3.5.2-1.1.noarch.rpm"
RPM_HASH = "a28b7629d7c2a7c4ba0f45e78896114442b950324fdb801cdc74c32151aeeef0f1e9b0b98c185634dd193050e4a284c028e5c80648069fe01a09737924fbea56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyquil) \
python39-pyquil \
python3dist(pyquil)"

RDEPENDS:${PN} += "(python39-importlib-metadata >= 3.7.3 if python39-base < 3.8) \
(python39-qcs-api-client >= 0.21 with python39-qcs-api-client < 0.22.0) \
python(abi) \
python39-Deprecated \
python39-lark \
python39-networkx \
python39-numpy \
python39-rpcq \
python39-scipy \
python39-tenacity"

inherit rpm
