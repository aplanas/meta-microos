SUMMARY = "Markdown extension for Sphinx"
DESCRIPTION = "Sphinx extension for including or writing pages in Markdown \
format. \
 \
sphinx-mdinclude is a simple Sphinx extension that enables \
including Markdown documents from within reStructuredText. It \
provides the .. mdinclude:: directive, and automatically converts \
the content of Markdown documents to reStructuredText format."
LICENSE = "MIT"

PV = "0.5.3"

RPM_NAME = "python39-sphinx_mdinclude-0.5.3-1.5.noarch.rpm"
RPM_HASH = "67c347854647cf23f51a1a1163341139b2a263149e6b8cdde4164853a7dae46034048900743cf4b99549808adb4b9d17d6d4c2ab87ee226c1bdd04120d9480a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinx-mdinclude \
python39-sphinx-mdinclude \
python3dist-sphinx-mdinclude"

RDEPENDS:${PN} += "python-abi"

inherit rpm
