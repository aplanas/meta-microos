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

RPM_NAME = "python310-iniconfig-2.0.0-3.1.noarch.rpm"
RPM_HASH = "6430a2ef0ef5140a9dce039ce6460f4ac4b442394990bc66d5f0c4624d4766e5ed1e3885f8dd378312deafe700ee52e1f9a9b8fb48dea4ad3bed3c0d3dd808b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-iniconfig \
python3.10dist(iniconfig) \
python310-iniconfig \
python3dist(iniconfig)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
