SUMMARY = "Python video metadata parser"
DESCRIPTION = "Enzyme is a Python module to parse video metadata."
LICENSE = "Apache-2.0"

PV = "0.4.1"

RPM_NAME = "python39-enzyme-0.4.1-4.13.noarch.rpm"
RPM_HASH = "0fdae72f3102608be9411179c5422ae8899572f9557c9d0151c450c869692b4f400c58b5778820baab1d13ead0060bada663a1ce6b1870f11b5c28a9ab334889"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(enzyme) \
python39-enzyme \
python3dist(enzyme)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
