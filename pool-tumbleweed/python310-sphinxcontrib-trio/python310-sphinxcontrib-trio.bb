SUMMARY = "Sphinx extension for documenting Python functions and methods"
DESCRIPTION = "This sphinx extension helps documenting Python code that uses \
async/await, or abstract methods, or context managers, or generators. \
It works by making sphinx's regular directives \
for documenting Python functions and methods smarter."
LICENSE = "Apache-2.0 | MIT"

PV = "1.1.2"

RPM_NAME = "python310-sphinxcontrib-trio-1.1.2-2.10.noarch.rpm"
RPM_HASH = "1f15d8200dec3fc7b59a6e2439a95a4ff6cbb031637b31ea75483446e06b59b4886ff91ccebf03b05f79459b74d6e61b848cfc34cc2a27e1d8413426d67103b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinxcontrib-trio \
python310-sphinxcontrib-trio \
python3dist-sphinxcontrib-trio"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx"

inherit rpm
