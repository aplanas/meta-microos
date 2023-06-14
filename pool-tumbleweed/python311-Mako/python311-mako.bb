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

RPM_NAME = "python311-Mako-1.2.4-1.4.noarch.rpm"
RPM_HASH = "aee43d6a248f837687feca583b2e9f18aa1a2fafb2995bdd1200fe81b98b88561cebd29791d945f66b6866880c18d4aa3042f3320e14edeaeb1eaf2ed379a4ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-mako \
python311-Mako \
python311-mako \
python3dist-mako"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
alts \
python-abi \
python311-MarkupSafe \
python311-setuptools"

inherit rpm
