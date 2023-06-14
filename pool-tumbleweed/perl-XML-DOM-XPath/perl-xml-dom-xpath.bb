SUMMARY = "Perl extension to add XPath support to XML::DOM, using XML::XPath engine"
DESCRIPTION = "XML::DOM::XPath allows you to use XML::XPath methods to query a DOM. This \
is often much easier than relying only on getElementsByTagName."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.14"

RPM_NAME = "perl-XML-DOM-XPath-0.14-7.16.noarch.rpm"
RPM_HASH = "b5181047d65448674a366dc0edc205f7c91d87ebc4b2b3d7a1792bfee41baa27e2ca832267cd334f4ca11298cea3250dce9c1e30935fe76265ab2ab3410ee0d1"
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
