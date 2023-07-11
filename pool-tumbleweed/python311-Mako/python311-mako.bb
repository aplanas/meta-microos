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

RPM_NAME = "python311-Mako-1.2.4-2.1.noarch.rpm"
RPM_HASH = "233be2242b8bb54cffc731a282a1507a6069217d0eb0061722f320e1b7c3de4ca742b16f90d5f7e430e45f3a959124c1edbc71e9074a3273eede839d911b0c10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Mako \
python3-mako \
python3.11dist-mako \
python311-Mako \
python311-mako \
python3dist-mako"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
alts \
python-abi \
python311-MarkupSafe \
python311-setuptools"

inherit rpm
