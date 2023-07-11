SUMMARY = "Sphinx extension for documenting Python functions and methods"
DESCRIPTION = "This sphinx extension helps documenting Python code that uses \
async/await, or abstract methods, or context managers, or generators. \
It works by making sphinx's regular directives \
for documenting Python functions and methods smarter."
LICENSE = "Apache-2.0 | MIT"

PV = "1.1.2"

RPM_NAME = "python311-sphinxcontrib-trio-1.1.2-2.10.noarch.rpm"
RPM_HASH = "6920bc8b39dcdf949c331c25041816027ba64c8e4618eca73f48967ce09cd4417da992e33df37058fa55931f69e0d3b2d1374cfead67ca186926169d08e79c74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-trio \
python3.11dist-sphinxcontrib-trio \
python311-sphinxcontrib-trio \
python3dist-sphinxcontrib-trio"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx"

inherit rpm
