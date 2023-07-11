SUMMARY = "Remove the template markup from html files"
DESCRIPTION = "Template remover is a tool to remove the PHP and Jinja markup from HTML files. \
 \
Many tools, like html tidy, are designed to parse and analyze html files, \
however they do not play well when there is language markup. This projects aims \
to be a simple way of getting rid of those markups."
LICENSE = "Apache-2.0"

PV = "0.1.9"

RPM_NAME = "python310-template-remover-0.1.9-3.19.noarch.rpm"
RPM_HASH = "e2ca3ac76264ac9bd3b1683de237443e8f02df59c95cba2a84dfb2f14a43a0d42aead6b88c8d17ea0304ca3306536842cce5c2dcb1749cb3fc7d5e9fddb06b0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-template-remover \
python310-template-remover \
python3dist-template-remover"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-docopt \
update-alternatives"

inherit rpm
