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

RPM_NAME = "python39-iniconfig-2.0.0-3.3.noarch.rpm"
RPM_HASH = "0c78602600406b8003f2745a08e0a8664d6575643bd11d12d8e8d96b5420e49504fb7342e340485023901e5ae97cca0b709cb17ff38fb7fa6f68ae6ab2685f23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-iniconfig \
python39-iniconfig \
python3dist-iniconfig"

RDEPENDS:${PN} += "python-abi"

inherit rpm
