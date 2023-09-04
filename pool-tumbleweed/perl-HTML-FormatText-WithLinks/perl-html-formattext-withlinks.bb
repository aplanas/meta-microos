SUMMARY = "HTML to text conversion with links as footnotes"
DESCRIPTION = "HTML::FormatText::WithLinks takes HTML and turns it into plain text but \
prints all the links in the HTML as footnotes. By default, it attempts to \
mimic the format of the lynx text based web browser's --dump option."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.15"

RPM_NAME = "perl-HTML-FormatText-WithLinks-0.15-1.21.noarch.rpm"
RPM_HASH = "203b2b8eb73f3b8a65c204a4ae8593926329c5a6041ed50a256f0533a228ff9b5725f7827caab5e4b17e1f2a6deb9331f4e8256fd59d30792f5a97fac8a6baab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTML--FormatText--WithLinks \
perl-HTML-FormatText-WithLinks"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-HTML--FormatText \
perl-HTML--TreeBuilder \
perl-URI--WithBase"

inherit rpm
