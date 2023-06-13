SUMMARY = "Library for writing quantum circuits"
DESCRIPTION = "Cirq is a software library for writing, manipulating, and optimizing \
quantum circuits and then running them against quantum computers and \
simulators. \
 \
This metapackage requires all circ subpackages"
LICENSE = "Apache-2.0"

PV = "0.13.1"

RPM_NAME = "python39-cirq-0.13.1-1.5.noarch.rpm"
RPM_HASH = "00640be5cb384b2664599702bc7301d47cda90f2a1e416bded6b3c553f21b142ae656472aa8f58e6528c700259a2e652c8cb51e731100e7452cd016f39565b2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(cirq) \
python39-cirq \
python3dist(cirq)"

RDEPENDS:${PN} += "python(abi) \
python39-cirq-aqt \
python39-cirq-core \
python39-cirq-google \
python39-cirq-ionq \
python39-cirq-pasqal \
python39-cirq-web"

inherit rpm
