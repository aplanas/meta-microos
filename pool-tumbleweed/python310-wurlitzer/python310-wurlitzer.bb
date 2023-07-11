SUMMARY = "Python package to capture C-level output in context managers"
DESCRIPTION = "Wurlitzer is a python package to capture C-level \
output in context managers."
LICENSE = "MIT"

PV = "3.0.3"

RPM_NAME = "python310-wurlitzer-3.0.3-1.5.noarch.rpm"
RPM_HASH = "3072293a07a5c5f55b0c9afdee42ec926825e37d0d7d1c3a9e64247934558ef61162f6b67509ddbaaec12516b20ce2e6e2410fd7112fef92f392486588883294"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-wurlitzer \
python310-wurlitzer \
python3dist-wurlitzer"

RDEPENDS:${PN} += "python-abi"

inherit rpm
