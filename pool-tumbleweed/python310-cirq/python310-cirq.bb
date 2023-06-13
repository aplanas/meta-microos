SUMMARY = "Library for writing quantum circuits"
DESCRIPTION = "Cirq is a software library for writing, manipulating, and optimizing \
quantum circuits and then running them against quantum computers and \
simulators. \
 \
This metapackage requires all circ subpackages"
LICENSE = "Apache-2.0"

PV = "0.13.1"

RPM_NAME = "python310-cirq-0.13.1-1.5.noarch.rpm"
RPM_HASH = "a149037e03d063539008cb9a5bccf3fe1e0cf676888c4e570c9e31997f80218d55458ac1738362e0bfb1bbc4a674ada4c9682b05e8d6cf13937ad4806b7906f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cirq \
python3.10dist(cirq) \
python310-cirq \
python3dist(cirq)"

RDEPENDS:${PN} += "python(abi) \
python310-cirq-aqt \
python310-cirq-core \
python310-cirq-google \
python310-cirq-ionq \
python310-cirq-pasqal \
python310-cirq-web"

inherit rpm
