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

RPM_NAME = "python39-sphinx_mdinclude-0.5.3-1.3.noarch.rpm"
RPM_HASH = "fd5371572d4e12a5d2930c9894702fa19556c7d5b3f8a26f9017e76551844841c68253b58c254c599bad58ae0e1ef89352f6461ddbd5f309332d9be0100debad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinx-mdinclude \
python39-sphinx-mdinclude \
python3dist-sphinx-mdinclude"

RDEPENDS:${PN} += "python-abi"

inherit rpm
