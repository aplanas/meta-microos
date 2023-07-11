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

RPM_NAME = "python310-parso-0.8.3-3.3.noarch.rpm"
RPM_HASH = "ba0c8086fa01b834b79832ceb29798196c80ccf54863ab44ce3469abeb7d91d8dd0f70b05e22b778c341a75d4bd59a670f954a99dab68ecec34afe3623bb64ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-parso \
python310-parso \
python3dist-parso"

RDEPENDS:${PN} += "python-abi"

inherit rpm
