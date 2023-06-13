SUMMARY = "Cirq quantum algorithms for NISQ devices"
DESCRIPTION = "Cirq is a Python library for writing, manipulating, and optimizing quantum \
circuits and running them against quantum computers and simulators. \
 \
This module contains everything you'd need to write quantum algorithms for NISQ devices and run them on the built-in Cirq simulators. \
In order to run algorithms on a given quantum hardware platform, you'll have to install the right cirq module as well."
LICENSE = "Apache-2.0"

PV = "0.13.1"

RPM_NAME = "python310-cirq-core-0.13.1-1.5.noarch.rpm"
RPM_HASH = "4a797a15cb8abc15a7d445fca2c139f9ab6721433f9c02ae1f523e95c67771367d06612f4bb389f0937f1b9ebe7c9e38317c586ff6e54a9c514856f94e09adb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cirq-core \
python3.10dist(cirq-core) \
python310-cirq-core \
python3dist(cirq-core)"

RDEPENDS:${PN} += "python(abi) \
python310-duet \
python310-matplotlib \
python310-networkx \
python310-numpy \
python310-pandas \
python310-scipy \
python310-sortedcontainers \
python310-sympy \
python310-tqdm \
python310-typing_extensions"

inherit rpm
