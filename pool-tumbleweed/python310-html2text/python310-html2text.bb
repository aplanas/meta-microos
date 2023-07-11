SUMMARY = "Python script for turning HTML into Markdown text"
DESCRIPTION = "html2text is a Python script that converts a page of HTML into \
Markdown (a text-to-HTML format)."
LICENSE = "GPL-3.0-only"

PV = "2020.1.16"

RPM_NAME = "python310-html2text-2020.1.16-4.1.noarch.rpm"
RPM_HASH = "d7a0c1d5aa066765a6d9372094d6f637b69d5a769216869ee65b8c159dc2bc53fde9d79dd4ecb31b02dada184c1f32e4e03a8954faa153d2e3f1bd50cd8d52fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "html2text \
python3.10dist-html2text \
python310-html2text \
python3dist-html2text"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
