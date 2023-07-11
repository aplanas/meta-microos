SUMMARY = "Remove the template markup from html files"
DESCRIPTION = "Template remover is a tool to remove the PHP and Jinja markup from HTML files. \
 \
Many tools, like html tidy, are designed to parse and analyze html files, \
however they do not play well when there is language markup. This projects aims \
to be a simple way of getting rid of those markups."
LICENSE = "Apache-2.0"

PV = "0.1.9"

RPM_NAME = "python311-template-remover-0.1.9-3.19.noarch.rpm"
RPM_HASH = "841c72cf89590327fdaa21116ed362f424dce8cf661ca43ce649d6d14a302aa534a15095518547440e7431ba421001c979aabe6d63ad1202f1cb7c2abaa3b581"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-template-remover \
python3.11dist-template-remover \
python311-template-remover \
python3dist-template-remover"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-docopt \
update-alternatives"

inherit rpm
