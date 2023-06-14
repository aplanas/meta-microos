SUMMARY = "Sphinx extension for documenting Python functions and methods"
DESCRIPTION = "This sphinx extension helps documenting Python code that uses \
async/await, or abstract methods, or context managers, or generators. \
It works by making sphinx's regular directives \
for documenting Python functions and methods smarter."
LICENSE = "Apache-2.0 | MIT"

PV = "1.1.2"

RPM_NAME = "python39-sphinxcontrib-trio-1.1.2-2.8.noarch.rpm"
RPM_HASH = "3135afdea2532f0f6e4fbfed6ff27cda2148c8228cca26a404bd1ba2c41946529462df2efe99ee38598a181b3089eb22e1eb6bf7d4e4093f32bf7221dc68cce5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinxcontrib-trio \
python39-sphinxcontrib-trio \
python3dist-sphinxcontrib-trio"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx"

inherit rpm
