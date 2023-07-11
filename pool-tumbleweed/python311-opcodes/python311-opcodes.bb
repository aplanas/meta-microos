SUMMARY = "Database of Processor Instructions/Opcodes"
DESCRIPTION = "The goal of this project is to document instruction sets in a format convenient \
for tools development. An instruction set is represented by three files: \
 \
- An XML file that describes instructions \
- An XSD file that describes the structure of the XML file \
- A Python module that reads the XML file and represents it as a set of Python \
  objects \
 \
This project is a spin-off from <https://github.com/Maratyszcza/PeachPy"
LICENSE = "BSD-2-Clause"

PV = "0.3.14"

RPM_NAME = "python311-opcodes-0.3.14-2.15.noarch.rpm"
RPM_HASH = "ff5023971d1d9bbc0b6e65707d36b66ab3337a325f0c0fcf897ba115f141eb91b717b2413d262185f62fb8330a97d9c161de9ebc317d93b3aebbfa86fc3ac532"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-opcodes \
python3.11dist-opcodes \
python311-opcodes \
python3dist-opcodes"

RDEPENDS:${PN} += "python-abi"

inherit rpm
