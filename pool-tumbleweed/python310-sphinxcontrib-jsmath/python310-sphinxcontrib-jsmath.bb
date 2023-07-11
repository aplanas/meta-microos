SUMMARY = "Sphinx extension which renders display math in HTML via JavaScript"
DESCRIPTION = "sphinxcontrib-jsmath is a sphinx extension which renders display math in HTML \
via JavaScript."
LICENSE = "BSD-2-Clause"

PV = "1.0.1"

RPM_NAME = "python310-sphinxcontrib-jsmath-1.0.1-4.2.noarch.rpm"
RPM_HASH = "946bf09acf4ea6bc5ade02e1fd420266c5cafc6815881f6079298dc4a7192f581616389992f580b5ee200f6a00c412d1d6dd4027038dd5990c9b2c9deb9b5d73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinxcontrib-jsmath \
python310-sphinxcontrib-jsmath \
python3dist-sphinxcontrib-jsmath"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx"

inherit rpm
