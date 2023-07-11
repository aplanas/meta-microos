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

RPM_NAME = "python310-sphinx_mdinclude-0.5.3-1.5.noarch.rpm"
RPM_HASH = "4d61b930db8335d5a61dc3d54bdc74e009a93f619d2fcc41835d5c1f4d0e8fc2c4828719e27f70f3bc33a8fb8a45110f4c8ef724f2f04ed85e2b69a99cad160a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinx-mdinclude \
python310-sphinx-mdinclude \
python3dist-sphinx-mdinclude"

RDEPENDS:${PN} += "python-abi"

inherit rpm
