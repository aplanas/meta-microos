SUMMARY = "Python port of markdown-it Markdown parsing"
DESCRIPTION = "This is a Python port of [markdown-it], and some of its associated plugins. \
 \
It follows the CommonMark spec for baseline parsing, has a configurable syntax and is pluggable."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python311-markdown-it-py-2.2.0-2.3.noarch.rpm"
RPM_HASH = "69bb40c06da873b88a2821c3771089441e27db1c6c4a0daadc9f14946f8740b4f96d6dcab842ef89b82f98690be3091551733d2aa4ac3992dd5e918130abcee1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-markdown-it-py \
python3.11dist-markdown-it-py \
python311-markdown-it-py \
python3dist-markdown-it-py"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-mdurl \
update-alternatives"

inherit rpm
