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

RPM_NAME = "python311-parso-0.8.3-3.1.noarch.rpm"
RPM_HASH = "4e431f82ec3f8f8c1c67c4ec45efca3c3c21c4b66a20b5fd384b099c61bbd082fdca1a48bc413ed7d63002d1a277e23e27e3cc7562c5a55b6f4d61fe9ec4be6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-parso \
python311-parso \
python3dist-parso"

RDEPENDS:${PN} += "python-abi"

inherit rpm
