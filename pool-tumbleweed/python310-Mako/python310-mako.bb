SUMMARY = "A Python templating language"
DESCRIPTION = "Mako is a template library written in Python. It provides a non-XML \
syntax which compiles into Python modules for performance. Mako's \
syntax and API borrows from Django templates, Cheetah, Myghty, and \
Genshi. Conceptually, Mako is an embedded Python (i.e. Python Server \
Page) language, which refines the ideas of componentized layout and \
inheritance, while maintaining close ties to Python calling and \
scoping semantics."
LICENSE = "MIT"

PV = "1.2.4"

RPM_NAME = "python310-Mako-1.2.4-2.1.noarch.rpm"
RPM_HASH = "1a1994e5418d77fd2ea3f8ca142350440c9493e315b2476d75955cc2659c8f2fbb7d7016bc960d8a579e309dd4cffe5126b17d5d6e09454c117dec4064c4fbe7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-mako \
python310-Mako \
python310-mako \
python3dist-mako"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
alts \
python-abi \
python310-MarkupSafe \
python310-setuptools"

inherit rpm
