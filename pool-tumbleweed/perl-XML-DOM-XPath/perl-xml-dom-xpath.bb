SUMMARY = "Perl extension to add XPath support to XML::DOM, using XML::XPath engine"
DESCRIPTION = "XML::DOM::XPath allows you to use XML::XPath methods to query a DOM. This \
is often much easier than relying only on getElementsByTagName."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.14"

RPM_NAME = "perl-XML-DOM-XPath-0.14-7.17.noarch.rpm"
RPM_HASH = "90e730a426f912a2b73f1eee49278cc159507201719837e80b1914f899a0ccd1f3180de01fad4f41acaf08349d6965bc5153a751cc9b071491b6ff91d1ca948a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--DOM--Attr \
perl-XML--DOM--Comment \
perl-XML--DOM--Document \
perl-XML--DOM--Element \
perl-XML--DOM--Namespace \
perl-XML--DOM--Node \
perl-XML--DOM--ProcessingInstruction \
perl-XML--DOM--Text \
perl-XML--DOM--XPath \
perl-XML-DOM-XPath"

RDEPENDS:${PN} += "perl \
perl-XML--DOM \
perl-XML--XPathEngine"

inherit rpm
