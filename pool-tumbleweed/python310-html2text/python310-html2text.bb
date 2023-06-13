SUMMARY = "Python script for turning HTML into Markdown text"
DESCRIPTION = "html2text is a Python script that converts a page of HTML into \
Markdown (a text-to-HTML format)."
LICENSE = "GPL-3.0-only"

PV = "2020.1.16"

RPM_NAME = "python310-html2text-2020.1.16-3.11.noarch.rpm"
RPM_HASH = "e27af3023350b9c106184996ac55de201f73d9af3f13305651a2b9719215e53c19560a64426eefb255427344462a86f715f901dbcdad3ffdd7708c172140a42f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "html2text \
python3-html2text \
python3.10dist(html2text) \
python310-html2text \
python3dist(html2text)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
update-alternatives"

inherit rpm
