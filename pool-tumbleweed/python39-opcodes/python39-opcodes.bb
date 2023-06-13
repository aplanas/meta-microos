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

RPM_NAME = "python39-opcodes-0.3.14-2.13.noarch.rpm"
RPM_HASH = "f7ca9e118788e826d42c60c441f78f80b45a9bd0264d963838c3629a20ee1bacacde371855548de9d8ead01b9bd2346c49674d55cdbd62bc0fd706f874863354"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(opcodes) \
python39-opcodes \
python3dist(opcodes)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
