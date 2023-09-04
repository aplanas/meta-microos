SUMMARY = "Atom feed and API implementation"
DESCRIPTION = "Atom is a syndication, API, and archiving format for weblogs and other \
data. _XML::Atom_ implements the feed format as well as a client for the \
API."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.43"

RPM_NAME = "perl-XML-Atom-0.43-1.11.noarch.rpm"
RPM_HASH = "284ee63f675d406b906feb626932b93962bde85374cb3372ac25b61168f1a521e4f2c989ca8300b45d9b86bd3d17143bc7af26aa1fb24ac8741d9b533f210dc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-LWP--UserAgent--AtomClient \
perl-XML--Atom \
perl-XML--Atom--Base \
perl-XML--Atom--Category \
perl-XML--Atom--Client \
perl-XML--Atom--Content \
perl-XML--Atom--Entry \
perl-XML--Atom--ErrorHandler \
perl-XML--Atom--Feed \
perl-XML--Atom--Link \
perl-XML--Atom--Namespace \
perl-XML--Atom--Person \
perl-XML--Atom--Server \
perl-XML--Atom--Thing \
perl-XML--Atom--Util \
perl-XML-Atom"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Class--Data--Inheritable \
perl-DateTime \
perl-DateTime--TimeZone \
perl-Digest--SHA \
perl-LWP--UserAgent \
perl-URI \
perl-XML--LibXML \
perl-XML--XPath"

inherit rpm
