SUMMARY = "Remove the template markup from html files"
DESCRIPTION = "Template remover is a tool to remove the PHP and Jinja markup from HTML files. \
 \
Many tools, like html tidy, are designed to parse and analyze html files, \
however they do not play well when there is language markup. This projects aims \
to be a simple way of getting rid of those markups."
LICENSE = "Apache-2.0"

PV = "0.1.9"

RPM_NAME = "python310-template-remover-0.1.9-3.17.noarch.rpm"
RPM_HASH = "06b1b26c95936cb56bbc4f3a3b77eb756d815fd967b7b514423ee13ab5b98fba5ab220b08c5adc629e2e6a9229f7044690fc62c99d4bb73bce4468b8834aae06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-template-remover \
python3.10dist(template-remover) \
python310-template-remover \
python3dist(template-remover)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-docopt \
update-alternatives"

inherit rpm
