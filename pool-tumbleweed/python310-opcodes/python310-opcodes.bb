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

RPM_NAME = "python310-opcodes-0.3.14-2.13.noarch.rpm"
RPM_HASH = "6baae440a4ebe0632c0edbd21477bd16f9f2111b870dab3344ccd5a578ca4f4253899aeffbb79acee6ba529937dd79706282418e8ff8a1de92eca3d26140a697"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-opcodes \
python3.10dist(opcodes) \
python310-opcodes \
python3dist(opcodes)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
