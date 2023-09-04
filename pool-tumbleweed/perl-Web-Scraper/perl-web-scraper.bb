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

RPM_NAME = "perl-Web-Scraper-0.38-1.11.noarch.rpm"
RPM_HASH = "be85f110f2002254163ab0693dd51aa03cf8cb137bae9da8d4789f23ab573430f7b62bd7ce63c7d35358a6d216246cc345c5b5bb2fffe414cd555b4221226df3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Web--Scraper \
perl-Web--Scraper--Filter \
perl-Web--Scraper--LibXML \
perl-Web-Scraper"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
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
