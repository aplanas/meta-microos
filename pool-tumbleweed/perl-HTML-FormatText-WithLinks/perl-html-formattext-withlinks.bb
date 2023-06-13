SUMMARY = "HTML to text conversion with links as footnotes"
DESCRIPTION = "HTML::FormatText::WithLinks takes HTML and turns it into plain text but \
prints all the links in the HTML as footnotes. By default, it attempts to \
mimic the format of the lynx text based web browser's --dump option."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.15"

RPM_NAME = "perl-HTML-FormatText-WithLinks-0.15-1.19.noarch.rpm"
RPM_HASH = "84de1750f57d58d352db1b79f397ea464137f80d3150d021d6b8bea528a82a05a1dcc5ff9460f334aa858c42673079e7d5bb6c596c7427542214a938d9889984"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(HTML::FormatText::WithLinks) \
perl-HTML-FormatText-WithLinks"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(HTML::FormatText) \
perl(HTML::TreeBuilder) \
perl(URI::WithBase)"

inherit rpm
