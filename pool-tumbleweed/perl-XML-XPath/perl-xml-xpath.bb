SUMMARY = "Parse and evaluate XPath statements"
DESCRIPTION = "This module aims to comply exactly to the XPath specification at \
http://www.w3.org/TR/xpath and yet allow extensions to be added in the form \
of functions.Modules such as XSLT and XPointer may need to do this as they \
support functionality beyond XPath."
LICENSE = "Artistic-2.0"

PV = "1.48"

RPM_NAME = "perl-XML-XPath-1.48-1.2.noarch.rpm"
RPM_HASH = "b665924e9e1eceec6bb3d5d9e78b532064e8cba9090e0770a83b4035167773426a990279319879b2fa9d4ed7338707fe0ca14daaa003c0c6614c40cbe579709f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--XPath \
perl-XML--XPath--Boolean \
perl-XML--XPath--Builder \
perl-XML--XPath--Expr \
perl-XML--XPath--Function \
perl-XML--XPath--Literal \
perl-XML--XPath--LocationPath \
perl-XML--XPath--Node \
perl-XML--XPath--Node--Attribute \
perl-XML--XPath--Node--AttributeImpl \
perl-XML--XPath--Node--Comment \
perl-XML--XPath--Node--CommentImpl \
perl-XML--XPath--Node--Element \
perl-XML--XPath--Node--ElementImpl \
perl-XML--XPath--Node--Namespace \
perl-XML--XPath--Node--NamespaceImpl \
perl-XML--XPath--Node--PI \
perl-XML--XPath--Node--PIImpl \
perl-XML--XPath--Node--Text \
perl-XML--XPath--Node--TextImpl \
perl-XML--XPath--NodeImpl \
perl-XML--XPath--NodeSet \
perl-XML--XPath--Number \
perl-XML--XPath--Parser \
perl-XML--XPath--PerlSAX \
perl-XML--XPath--Root \
perl-XML--XPath--Step \
perl-XML--XPath--Variable \
perl-XML--XPath--XMLParser \
perl-XML-XPath"

RDEPENDS:${PN} += "/usr/bin/env \
perl--MODULE-COMPAT-5.36.0 \
perl-Scalar--Util \
perl-XML--Parser"

inherit rpm
