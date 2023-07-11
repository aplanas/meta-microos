SUMMARY = "Python script for turning HTML into Markdown text"
DESCRIPTION = "html2text is a Python script that converts a page of HTML into \
Markdown (a text-to-HTML format)."
LICENSE = "GPL-3.0-only"

PV = "2020.1.16"

RPM_NAME = "python311-html2text-2020.1.16-4.1.noarch.rpm"
RPM_HASH = "bfb9f77b2e6f75c01608ec6d7dab2d7b33cda678ffb1215c6c8a5a5d13a603ccc6abfa7b63d26399492623aaf1e3735ee70a856206d009508b975dabefa56c49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "html2text \
python3-html2text \
python3.11dist-html2text \
python311-html2text \
python3dist-html2text"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
