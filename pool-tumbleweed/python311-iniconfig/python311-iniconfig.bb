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

RPM_NAME = "python311-iniconfig-2.0.0-3.3.noarch.rpm"
RPM_HASH = "226019f18e14b42553b04fa7158a424de1a490541dcfaad256183080ae8b2199678df6d400689fad951a54926d2d756ef6ede7db4b955d4c00b07b464b7b8a9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-iniconfig \
python3.11dist-iniconfig \
python311-iniconfig \
python3dist-iniconfig"

RDEPENDS:${PN} += "python-abi"

inherit rpm
