SUMMARY = "Sphinx extension for documenting Python functions and methods"
DESCRIPTION = "This sphinx extension helps documenting Python code that uses \
async/await, or abstract methods, or context managers, or generators. \
It works by making sphinx's regular directives \
for documenting Python functions and methods smarter."
LICENSE = "Apache-2.0 | MIT"

PV = "1.1.2"

RPM_NAME = "python310-sphinxcontrib-trio-1.1.2-2.8.noarch.rpm"
RPM_HASH = "735955915b69ad68848523dddd964ce974750e860dccb0799ed5a1fef9f4c68d7349d6daac30af935fc71737d4275a1cae287592da064dfaad1813ebb03bb838"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-trio \
python3.10dist(sphinxcontrib-trio) \
python310-sphinxcontrib-trio \
python3dist(sphinxcontrib-trio)"

RDEPENDS:${PN} += "python(abi) \
python310-Sphinx"

inherit rpm
