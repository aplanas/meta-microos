SUMMARY = "Python script for turning HTML into Markdown text"
DESCRIPTION = "html2text is a Python script that converts a page of HTML into \
Markdown (a text-to-HTML format)."
LICENSE = "GPL-3.0-only"

PV = "2020.1.16"

RPM_NAME = "python311-html2text-2020.1.16-3.11.noarch.rpm"
RPM_HASH = "6cdede02081beb5c3702ff0102b1817572be7c266a648481f1e8b14bea9401e9f69ce06141359957e72f58e8c84d65fdbdd05f61c81ee3e1f522a2a6cac44cf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "html2text \
python3.11dist-html2text \
python311-html2text \
python3dist-html2text"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
