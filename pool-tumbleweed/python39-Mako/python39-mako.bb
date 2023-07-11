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

RPM_NAME = "python39-Mako-1.2.4-2.1.noarch.rpm"
RPM_HASH = "87bc6a9f401c4d7be220f5ef3dfed8a95c6cc618b6513134a65058fed994add8bc6f7f8da3334cae87f0210c8443ecbbbab6be0585647b50f40dd7c102bb72e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mako \
python39-Mako \
python39-mako \
python3dist-mako"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
alts \
python-abi \
python39-MarkupSafe \
python39-setuptools"

inherit rpm
