SUMMARY = "Python namespace class"
DESCRIPTION = "A Python namespace class derived from OrderedDict, \
including tab-completion"
LICENSE = "MIT"

PV = "2019.6.8"

RPM_NAME = "python39-ordered-namespace-2019.6.8-1.20.noarch.rpm"
RPM_HASH = "1c9f0f56a7007ebd0cca2a2037396c4e09c16401b42312239ca8b34c03919b1be79a1c117d78c69f881a2f52197a197bd4d5c828dc1132439124166f3167541c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ordered-namespace \
python39-ordered-namespace \
python3dist-ordered-namespace"

RDEPENDS:${PN} += "python-abi"

inherit rpm
