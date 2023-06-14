SUMMARY = "Cirq quantum algorithms for NISQ devices"
DESCRIPTION = "Cirq is a Python library for writing, manipulating, and optimizing quantum \
circuits and running them against quantum computers and simulators. \
 \
This module contains everything you'd need to write quantum algorithms for NISQ devices and run them on the built-in Cirq simulators. \
In order to run algorithms on a given quantum hardware platform, you'll have to install the right cirq module as well."
LICENSE = "Apache-2.0"

PV = "0.13.1"

RPM_NAME = "python38-cirq-core-0.13.1-1.5.noarch.rpm"
RPM_HASH = "1e6adffcec9b0080ec22ddf89cddb339bf5d1dec7d004139ca23a345046f53996bc445ea20f13d0378f68aa6424ff6de558bc8d2f712bf5f59660d8e886ebff4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.8dist-cirq-core \
python38-cirq-core \
python3dist-cirq-core"

RDEPENDS:${PN} += "python-abi \
python38-duet \
python38-matplotlib \
python38-networkx \
python38-numpy \
python38-pandas \
python38-scipy \
python38-sortedcontainers \
python38-sympy \
python38-tqdm \
python38-typing-extensions"

inherit rpm
