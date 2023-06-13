SUMMARY = "Sphinx extension which renders display math in HTML via JavaScript"
DESCRIPTION = "sphinxcontrib-jsmath is a sphinx extension which renders display math in HTML \
via JavaScript."
LICENSE = "BSD-2-Clause"

PV = "1.0.1"

RPM_NAME = "python310-sphinxcontrib-jsmath-1.0.1-4.1.noarch.rpm"
RPM_HASH = "79d90706651a5dae2df967cdeec13efb7d2e4a49c13da20b64c23f848f4a275ea0045d5081cf7ff75ade194b16ea331a87f63b7d8fd9441baf6e54a5e2c94c6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-jsmath \
python3.10dist(sphinxcontrib-jsmath) \
python310-sphinxcontrib-jsmath \
python3dist(sphinxcontrib-jsmath)"

RDEPENDS:${PN} += "python(abi) \
python310-Sphinx"

inherit rpm
