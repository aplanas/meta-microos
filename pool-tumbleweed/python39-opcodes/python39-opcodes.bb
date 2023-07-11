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

RPM_NAME = "python39-opcodes-0.3.14-2.15.noarch.rpm"
RPM_HASH = "3603a21f4d0b3b18afabfea42182f66085635345e2b976d6b3b620b495dd6ee7cb025e5d2cbc472c06b21f29694830fcb0f9dd61f98bbaa44980df26df0041ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-opcodes \
python39-opcodes \
python3dist-opcodes"

RDEPENDS:${PN} += "python-abi"

inherit rpm
