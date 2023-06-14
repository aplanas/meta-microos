SUMMARY = "Python script for turning HTML into Markdown text"
DESCRIPTION = "html2text is a Python script that converts a page of HTML into \
Markdown (a text-to-HTML format)."
LICENSE = "GPL-3.0-only"

PV = "2020.1.16"

RPM_NAME = "python39-html2text-2020.1.16-3.11.noarch.rpm"
RPM_HASH = "5df5eb9e5b2378f1e2315b2757e62108de62fc984173ce08e165b8fff2ef1f2050bd3983d5e85d080af65bf665b91c960d8325631d0fd9db87fc84957d01383c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "html2text \
python3.9dist-html2text \
python39-html2text \
python3dist-html2text"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
update-alternatives"

inherit rpm
