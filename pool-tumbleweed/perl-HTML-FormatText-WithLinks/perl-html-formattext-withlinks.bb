SUMMARY = "HTML to text conversion with links as footnotes"
DESCRIPTION = "HTML::FormatText::WithLinks takes HTML and turns it into plain text but \
prints all the links in the HTML as footnotes. By default, it attempts to \
mimic the format of the lynx text based web browser's --dump option."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.15"

RPM_NAME = "perl-HTML-FormatText-WithLinks-0.15-1.20.noarch.rpm"
RPM_HASH = "1c170c2b01313804607fda2b4204756478d74dfcfe42877d2d910b9e96a920987bfcd93f1dd3e50acd71692a9e75bea1cff8cf92e9e764ab4e2f34494b466ae2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTML--FormatText--WithLinks \
perl-HTML-FormatText-WithLinks"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-HTML--FormatText \
perl-HTML--TreeBuilder \
perl-URI--WithBase"

inherit rpm
