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

RPM_NAME = "python310-opcodes-0.3.14-2.15.noarch.rpm"
RPM_HASH = "455f811334c18116bf37f476fb2afb630b992eb00185a11c7d56d719787717b878d69e2975e4bafbf5521d07b34fdf6a29d4dc4599abc573cdea506e98fe211a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-opcodes \
python310-opcodes \
python3dist-opcodes"

RDEPENDS:${PN} += "python-abi"

inherit rpm
