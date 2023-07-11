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

RPM_NAME = "python39-parso-0.8.3-3.3.noarch.rpm"
RPM_HASH = "5cbfb21b1035b1771607eaab48b50036015324bc4757b38fc6577a42609abfb48113fd00ffbf1f7bd3465c729658509b3272ba259a55324d80befe15828e0d71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-parso \
python39-parso \
python3dist-parso"

RDEPENDS:${PN} += "python-abi"

inherit rpm
