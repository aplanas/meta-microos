SUMMARY = "Python namespace class"
DESCRIPTION = "A Python namespace class derived from OrderedDict, \
including tab-completion"
LICENSE = "MIT"

PV = "2019.6.8"

RPM_NAME = "python310-ordered-namespace-2019.6.8-1.19.noarch.rpm"
RPM_HASH = "fc54107e5cd08494e2b5c4ff89ef12c4e7bcd9b91d127e07600bb692de066b42f8ede9c32fb5a6dd25beeb0fcd6100bca4e9093fef1ea5a6a7c58319fee3f210"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ordered-namespace \
python3.10dist-ordered-namespace \
python310-ordered-namespace \
python3dist-ordered-namespace"

RDEPENDS:${PN} += "python-abi"

inherit rpm
