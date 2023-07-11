SUMMARY = "Remove the template markup from html files"
DESCRIPTION = "Template remover is a tool to remove the PHP and Jinja markup from HTML files. \
 \
Many tools, like html tidy, are designed to parse and analyze html files, \
however they do not play well when there is language markup. This projects aims \
to be a simple way of getting rid of those markups."
LICENSE = "Apache-2.0"

PV = "0.1.9"

RPM_NAME = "python39-template-remover-0.1.9-3.19.noarch.rpm"
RPM_HASH = "cef0da0a5fbdc2ed8cd16e0298ea9e01152b4edf86391b97d484948034c7531c93a58186e1fcfb925e18c4a84a64158203d4a8f0432671c692a1897e9650e9f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-template-remover \
python39-template-remover \
python3dist-template-remover"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-docopt \
update-alternatives"

inherit rpm
