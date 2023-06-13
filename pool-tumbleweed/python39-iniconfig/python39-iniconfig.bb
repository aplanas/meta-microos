SUMMARY = "iniconfig: brain-dead simple config-ini parsing"
DESCRIPTION = "iniconfig is a small and simple INI-file parser module \
having a unique set of features: \
 \
* tested against Python2.4 across to Python3.2, Jython, PyPy \
* maintains order of sections and entries \
* supports multi-line values with or without line-continuations \
* supports '#' comments everywhere \
* raises errors with proper line-numbers \
* no bells and whistles like automatic substitutions \
* iniconfig raises an Error if two sections have the same name."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python39-iniconfig-2.0.0-3.1.noarch.rpm"
RPM_HASH = "37f28dc48005ec5223720a62d3b25511369361d30d22812f68ff84cccf1a682d45aa65283680ef9d083fc0fa6985aed3cdc875c844994e3d64e430a7723cb0a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(iniconfig) \
python39-iniconfig \
python3dist(iniconfig)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
