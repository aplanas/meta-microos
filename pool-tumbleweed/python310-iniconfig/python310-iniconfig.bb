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

RPM_NAME = "python310-iniconfig-2.0.0-3.3.noarch.rpm"
RPM_HASH = "f0ae53444aad4a4f9779a715b361ee1630351fc6eee3977aab351349ce6010f6680bfcbd9d5bf10bb288d358ab09812b83a7311cb4ebf4bbc7a4a7439c5d0a5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-iniconfig \
python310-iniconfig \
python3dist-iniconfig"

RDEPENDS:${PN} += "python-abi"

inherit rpm
