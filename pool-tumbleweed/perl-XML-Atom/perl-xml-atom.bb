SUMMARY = "Atom feed and API implementation"
DESCRIPTION = "Atom is a syndication, API, and archiving format for weblogs and other \
data. _XML::Atom_ implements the feed format as well as a client for the \
API."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.43"

RPM_NAME = "perl-XML-Atom-0.43-1.10.noarch.rpm"
RPM_HASH = "d2f14a4c2a13e0f3cb85ed3fad1aedb4fa10d07cf145595892f351d5a7ad6addcc074f1b11f0a8f23b8d1670d3b24ca22b026e105e4b9e01ae31166a0f5eeae9"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Class--Data--Inheritable \
perl-DateTime \
perl-DateTime--TimeZone \
perl-Digest--SHA \
perl-LWP--UserAgent \
perl-URI \
perl-XML--LibXML \
perl-XML--XPath"

inherit rpm
