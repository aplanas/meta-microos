SUMMARY = "Sphinx extension for documenting Python functions and methods"
DESCRIPTION = "This sphinx extension helps documenting Python code that uses \
async/await, or abstract methods, or context managers, or generators. \
It works by making sphinx's regular directives \
for documenting Python functions and methods smarter."
LICENSE = "Apache-2.0 | MIT"

PV = "1.1.2"

RPM_NAME = "python311-sphinxcontrib-trio-1.1.2-2.8.noarch.rpm"
RPM_HASH = "8d71534a3ed2a99411ae63418f07b0a7fc3a3e377632ce930477e5d5b45369b45bf241cbc651c6118d871e7031dc58cb6cfa372dc1bcd865d2c472d1b36c6366"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sphinxcontrib-trio) \
python311-sphinxcontrib-trio \
python3dist(sphinxcontrib-trio)"

RDEPENDS:${PN} += "python(abi) \
python311-Sphinx"

inherit rpm
