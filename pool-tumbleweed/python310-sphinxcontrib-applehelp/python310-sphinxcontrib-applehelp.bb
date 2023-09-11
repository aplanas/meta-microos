SUMMARY = "Sphinx extension which outputs Apple help books"
DESCRIPTION = "sphinxcontrib-applehelp is a sphinx extension which outputs Apple help books"
LICENSE = "BSD-2-Clause"

PV = "1.0.7"

RPM_NAME = "python310-sphinxcontrib-applehelp-1.0.7-1.1.noarch.rpm"
RPM_HASH = "b2e6be84289e53767dabedb75a5440132b860b96ce765110d89fae99d0811022de5548a239534783bc937f689c42553667f81911fce058a186a73917303c8a0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinxcontrib-applehelp \
python310-sphinxcontrib-applehelp \
python3dist-sphinxcontrib-applehelp"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx"

inherit rpm
