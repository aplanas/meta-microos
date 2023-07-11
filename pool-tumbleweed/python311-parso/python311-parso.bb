SUMMARY = "An autocompletion tool for Python"
DESCRIPTION = "Parso is a Python parser that supports error recovery and round-trip \
parsing for different Python versions (in multiple Python \
versions). Parso is also able to list multiple syntax errors in your \
python file. \
 \
Parso has been battle-tested by jedi. It was pulled out of jedi to be \
useful for other projects as well. \
 \
Parso consists of a small API to parse Python and analyse the syntax \
tree."
LICENSE = "MIT & Python-2.0"

PV = "0.8.3"

RPM_NAME = "python311-parso-0.8.3-3.3.noarch.rpm"
RPM_HASH = "0eb8da65885c66a47e631b96a2222eb28505411b1865ef3d8a57cebeff81cb7d94e4c9e24aae9b8b771dd500ac4ec7a4d5f698f9225d0f30953849ff33bcc333"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-parso \
python3.11dist-parso \
python311-parso \
python3dist-parso"

RDEPENDS:${PN} += "python-abi"

inherit rpm
