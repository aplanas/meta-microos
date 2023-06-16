SUMMARY = "Remove the template markup from html files"
DESCRIPTION = "Template remover is a tool to remove the PHP and Jinja markup from HTML files. \
 \
Many tools, like html tidy, are designed to parse and analyze html files, \
however they do not play well when there is language markup. This projects aims \
to be a simple way of getting rid of those markups."
LICENSE = "Apache-2.0"

PV = "0.1.9"

RPM_NAME = "python311-template-remover-0.1.9-3.17.noarch.rpm"
RPM_HASH = "315d9ff0b027ac313c570ea4a55d5f0032ae89b042c21ce35a99cc21aad13c4ed3ab331b7eb2e25071c55b099ddf620685506f7bb945e12f68d3c3290a06f84f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-template-remover \
python311-template-remover \
python3dist-template-remover"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-docopt \
update-alternatives"

inherit rpm
