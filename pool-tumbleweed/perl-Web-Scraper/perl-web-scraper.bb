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

RPM_NAME = "perl-Web-Scraper-0.38-1.9.noarch.rpm"
RPM_HASH = "1f262bd2f1f7d831041f40142f64478d3208afed95de4953282e1efa3f770b8ad2fd5b331f788c76636cc71192a8e4de644c20c46bdda82d2753f4fc68831f51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Web--Scraper \
perl-Web--Scraper--Filter \
perl-Web--Scraper--LibXML \
perl-Web-Scraper"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
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
