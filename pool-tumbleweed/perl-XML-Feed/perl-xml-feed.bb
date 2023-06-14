SUMMARY = "Syndication feed parser and auto-discovery"
DESCRIPTION = "_XML::Feed_ is a syndication feed parser for both RSS and Atom feeds. It \
also implements feed auto-discovery for finding feeds, given a URI. \
 \
_XML::Feed_ supports the following syndication feed formats: \
 \
* * RSS 0.91 \
 \
* * RSS 1.0 \
 \
* * RSS 2.0 \
 \
* * Atom \
 \
The goal of _XML::Feed_ is to provide a unified API for parsing and using \
the various syndication formats. The different flavors of RSS and Atom \
handle data in different ways: date handling; summaries and content; \
escaping and quoting; etc. This module attempts to remove those differences \
by providing a wrapper around the formats and the classes implementing \
those formats (XML::RSS and XML::Atom::Feed). For example, dates are \
handled differently in each of the above formats. To provide a unified API \
for date handling, _XML::Feed_ converts all date formats transparently into \
DateTime objects, which it then returns to the caller."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.63"

RPM_NAME = "perl-XML-Feed-0.63-1.9.noarch.rpm"
RPM_HASH = "9c99c805e93002a6915974ebe14bf457134b1a193d090ed8a52cbeb12493175fb2d8a70f07c5f5835bd197c9f0363361e9d8c29f012bef69b0f603b6ef016fd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--Feed \
perl-XML--Feed--Content \
perl-XML--Feed--Enclosure \
perl-XML--Feed--Entry \
perl-XML--Feed--Entry--Format--Atom \
perl-XML--Feed--Entry--Format--RSS \
perl-XML--Feed--Format--Atom \
perl-XML--Feed--Format--RSS \
perl-XML--Feed--Util \
perl-XML-Feed"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Class--ErrorHandler \
perl-DateTime \
perl-DateTime--Format--Flexible \
perl-DateTime--Format--ISO8601 \
perl-DateTime--Format--Mail \
perl-DateTime--Format--Natural \
perl-DateTime--Format--W3CDTF \
perl-Feed--Find \
perl-HTML--Entities \
perl-HTML--TokeParser \
perl-LWP--UserAgent \
perl-Module--Pluggable \
perl-URI--Fetch \
perl-XML--Atom \
perl-XML--LibXML \
perl-XML--RSS"

inherit rpm
