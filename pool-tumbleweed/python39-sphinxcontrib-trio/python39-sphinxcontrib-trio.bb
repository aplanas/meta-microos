SUMMARY = "Sphinx extension for documenting Python functions and methods"
DESCRIPTION = "This sphinx extension helps documenting Python code that uses \
async/await, or abstract methods, or context managers, or generators. \
It works by making sphinx's regular directives \
for documenting Python functions and methods smarter."
LICENSE = "Apache-2.0 | MIT"

PV = "1.1.2"

RPM_NAME = "python39-sphinxcontrib-trio-1.1.2-2.10.noarch.rpm"
RPM_HASH = "5a19c72f5088cfbb19ae750e954c3e387436d861ce7c554851aaab28772e8418193f447876cfe93858f8caccf3a5449d566504d476ba3a31a70e9f89522dbe71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinxcontrib-trio \
python39-sphinxcontrib-trio \
python3dist-sphinxcontrib-trio"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx"

inherit rpm
