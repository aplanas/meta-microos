SUMMARY = "A lexer and codec to work with LaTeX code in Python"
DESCRIPTION = "A lexer and codec to work with LaTeX code in Python."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python311-latexcodec-2.0.1-3.2.noarch.rpm"
RPM_HASH = "cc458cfdfcbaa2593e6e55d6a8302b4be71e53bc79e30dd778dc13fee7fc3b684ee0570c619cd3bc1fc2ae21dc39e939fe3d098128309b764c56edfc8349c6e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(latexcodec) \
python311-latexcodec \
python3dist(latexcodec)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
