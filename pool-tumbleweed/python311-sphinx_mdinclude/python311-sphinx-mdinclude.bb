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

RPM_NAME = "python311-sphinx_mdinclude-0.5.3-1.5.noarch.rpm"
RPM_HASH = "f3ac41fbb446f51ed7c723478fbebed4e916b8c3213471ca9699d1772726bd83ad6ebe6db3a9c18acf5295849bcea6dbfef046e44923274be72a46a39c089509"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-mdinclude \
python3.11dist-sphinx-mdinclude \
python311-sphinx-mdinclude \
python3dist-sphinx-mdinclude"

RDEPENDS:${PN} += "python-abi"

inherit rpm
