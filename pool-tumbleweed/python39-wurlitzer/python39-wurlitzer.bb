SUMMARY = "Python package to capture C-level output in context managers"
DESCRIPTION = "Wurlitzer is a python package to capture C-level \
output in context managers."
LICENSE = "MIT"

PV = "3.0.3"

RPM_NAME = "python39-wurlitzer-3.0.3-1.5.noarch.rpm"
RPM_HASH = "77855d3b3197097a010114f75ea96fe04ac34fe2d81509e12fe3e074df56d149b815f08689b21edfff5cb6306d9c7e113ca103eec1a7112289dad684ddffbfe3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-wurlitzer \
python39-wurlitzer \
python3dist-wurlitzer"

RDEPENDS:${PN} += "python-abi"

inherit rpm
