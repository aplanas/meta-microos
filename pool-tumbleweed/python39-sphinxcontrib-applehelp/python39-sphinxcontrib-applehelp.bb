SUMMARY = "Sphinx extension which outputs Apple help books"
DESCRIPTION = "sphinxcontrib-applehelp is a sphinx extension which outputs Apple help books"
LICENSE = "BSD-2-Clause"

PV = "1.0.4"

RPM_NAME = "python39-sphinxcontrib-applehelp-1.0.4-2.1.noarch.rpm"
RPM_HASH = "2f031695c98c9805a43c8b1962ca2b4d515b598d8585e5a76f7ccfd792303c2e37905f782c0c2a385f45f530760ce576f225cab276d1b07d847843c6db1e3a67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sphinxcontrib-applehelp) \
python39-sphinxcontrib-applehelp \
python3dist(sphinxcontrib-applehelp)"

RDEPENDS:${PN} += "python(abi) \
python39-Sphinx"

inherit rpm
