SUMMARY = "Library for writing quantum circuits"
DESCRIPTION = "Cirq is a software library for writing, manipulating, and optimizing \
quantum circuits and then running them against quantum computers and \
simulators. \
 \
This metapackage requires all circ subpackages"
LICENSE = "Apache-2.0"

PV = "0.13.1"

RPM_NAME = "python38-cirq-0.13.1-1.5.noarch.rpm"
RPM_HASH = "d02687b4e9782f9aef8bec23096f44571a4df378a8e799316881293267d2ff684cbbef76766f3b4ef174e7fb0a8786d1bc0ff19cc5ad80ae7771d85d9e52486c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.8dist(cirq) \
python38-cirq \
python3dist(cirq)"

RDEPENDS:${PN} += "python(abi) \
python38-cirq-aqt \
python38-cirq-core \
python38-cirq-google \
python38-cirq-ionq \
python38-cirq-pasqal \
python38-cirq-web"

inherit rpm
