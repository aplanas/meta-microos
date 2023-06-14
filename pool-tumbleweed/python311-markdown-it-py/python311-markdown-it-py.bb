SUMMARY = "Python port of markdown-it Markdown parsing"
DESCRIPTION = "This is a Python port of [markdown-it], and some of its associated plugins. \
 \
It follows the CommonMark spec for baseline parsing, has a configurable syntax and is pluggable."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python311-markdown-it-py-2.2.0-2.1.noarch.rpm"
RPM_HASH = "34388dbbf2e96d801e02c90e4fa038aa1420807f1226c355c7b13e6c8c3c44804e8c03045cdc1a2d1e091048e82c4171f7258f9f8547f8b6972713e0029417c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-markdown-it-py \
python311-markdown-it-py \
python3dist-markdown-it-py"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-mdurl \
update-alternatives"

inherit rpm
