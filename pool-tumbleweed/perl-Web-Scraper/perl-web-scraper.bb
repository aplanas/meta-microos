SUMMARY = "Web Scraping Toolkit using HTML and CSS Selectors or XPath expressions"
DESCRIPTION = "Web::Scraper is a web scraper toolkit, inspired by Ruby's equivalent \
Scrapi. It provides a DSL-ish interface for traversing HTML documents and \
returning a neatly arranged Perl data structure. \
 \
The _scraper_ and _process_ blocks provide a method to define what segments \
of a document to extract. It understands HTML and CSS Selectors as well as \
XPath expressions."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.38"

RPM_NAME = "perl-Web-Scraper-0.38-1.10.noarch.rpm"
RPM_HASH = "1eca3a787350e21cf074deeef83b2e304e7ab3a806b83f2f78055ccd9d837767d960c579217ca7a6694bc173d08c7c0f950af584018e6d8f1b1357496b23071a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Web--Scraper \
perl-Web--Scraper--Filter \
perl-Web--Scraper--LibXML \
perl-Web-Scraper"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-HTML--Entities \
perl-HTML--Selector--XPath \
perl-HTML--Tagset \
perl-HTML--TreeBuilder \
perl-HTML--TreeBuilder--XPath \
perl-LWP \
perl-UNIVERSAL--require \
perl-URI \
perl-XML--XPathEngine \
perl-YAML"

inherit rpm
