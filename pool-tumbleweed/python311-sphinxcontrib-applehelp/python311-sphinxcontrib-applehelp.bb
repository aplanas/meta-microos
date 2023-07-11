SUMMARY = "Sphinx extension which outputs Apple help books"
DESCRIPTION = "sphinxcontrib-applehelp is a sphinx extension which outputs Apple help books"
LICENSE = "BSD-2-Clause"

PV = "1.0.4"

RPM_NAME = "python311-sphinxcontrib-applehelp-1.0.4-2.3.noarch.rpm"
RPM_HASH = "4481ba364abb8333f1eda0741d373331041ea533aaf126dada664f43964d213f9daa6a00f8ee482565540c27809e75d853f238c6d02b6d442a68fdeab74847c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-applehelp \
python3.11dist-sphinxcontrib-applehelp \
python311-sphinxcontrib-applehelp \
python3dist-sphinxcontrib-applehelp"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx"

inherit rpm
