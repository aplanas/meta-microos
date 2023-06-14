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

RPM_NAME = "python311-sphinx_mdinclude-0.5.3-1.3.noarch.rpm"
RPM_HASH = "c795d8e097dfe6d8c03ebc1677c2c9ed8fca27b026925286cc4be0b03387a5e60002ab6c74dfd6b24bc01267b9ecb9a03e64cdc308742788dc885f8ce03be999"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-sphinx-mdinclude \
python311-sphinx-mdinclude \
python3dist-sphinx-mdinclude"

RDEPENDS:${PN} += "python-abi"

inherit rpm
