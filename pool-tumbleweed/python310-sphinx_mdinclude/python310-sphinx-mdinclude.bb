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

RPM_NAME = "python310-sphinx_mdinclude-0.5.3-1.3.noarch.rpm"
RPM_HASH = "c587e6b18dc35102be6369923621463d5375a392fbb6e29c39246bd94d911d1f71914d28d89e6cc7f8ebcf5a7ef4371b785e28b22fa5bb4a69e969c3c024dfaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-mdinclude \
python3.10dist-sphinx-mdinclude \
python310-sphinx-mdinclude \
python3dist-sphinx-mdinclude"

RDEPENDS:${PN} += "python-abi"

inherit rpm
