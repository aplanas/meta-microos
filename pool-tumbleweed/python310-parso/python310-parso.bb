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

RPM_NAME = "python310-parso-0.8.3-3.1.noarch.rpm"
RPM_HASH = "3c40b194a988f2e9c4bdaff49882961ab44daa2e9f50b3890dce36cffcb40598ce135dbefb0ef576f9c79b26946f5d4080305b437f2b46ab69fb00559b4021f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-parso \
python3.10dist-parso \
python310-parso \
python3dist-parso"

RDEPENDS:${PN} += "python-abi"

inherit rpm
