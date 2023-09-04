SUMMARY = "Perl extension to add XPath support to XML::DOM, using XML::XPath engine"
DESCRIPTION = "XML::DOM::XPath allows you to use XML::XPath methods to query a DOM. This \
is often much easier than relying only on getElementsByTagName."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.14"

RPM_NAME = "perl-XML-DOM-XPath-0.14-7.18.noarch.rpm"
RPM_HASH = "53bd3c394ea5709ce26fca750a2ebaf5dc3721cb09141fb08e738c7cd4ea28b2733cbb4a1d639969807dac7e2e44ec42559df6b6fd21f97a2bd230477cb16e22"
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
