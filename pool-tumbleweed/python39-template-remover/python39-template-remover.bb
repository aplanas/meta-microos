SUMMARY = "Remove the template markup from html files"
DESCRIPTION = "Template remover is a tool to remove the PHP and Jinja markup from HTML files. \
 \
Many tools, like html tidy, are designed to parse and analyze html files, \
however they do not play well when there is language markup. This projects aims \
to be a simple way of getting rid of those markups."
LICENSE = "Apache-2.0"

PV = "0.1.9"

RPM_NAME = "python39-template-remover-0.1.9-3.17.noarch.rpm"
RPM_HASH = "88574036f13c681572cc1aa10048336f252cb2fb3deca76229d89505f1f165376fe8a6ebc6ce8576d25f8b00f19c5c4a4c96386066701b2856240e2a1945b840"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-template-remover \
python39-template-remover \
python3dist-template-remover"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-docopt \
update-alternatives"

inherit rpm
