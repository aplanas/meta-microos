SUMMARY = "An API for simple XML files"
DESCRIPTION = "The XML::Simple module provides a simple API layer on top of an underlying \
XML parsing module (either XML::Parser or one of the SAX2 parser modules). \
Two functions are exported: 'XMLin()' and 'XMLout()'. Note: you can \
explicitly request the lower case versions of the function names: \
'xml_in()' and 'xml_out()'. \
 \
The simplest approach is to call these two functions directly, but an \
optional object oriented interface (see 'OPTIONAL OO INTERFACE' below) \
allows them to be called as methods of an *XML::Simple* object. The object \
interface can also be used at either end of a SAX pipeline."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.25"

RPM_NAME = "perl-XML-Simple-2.25-1.18.noarch.rpm"
RPM_HASH = "9c9c613d13250470e04b299961e616a1ab08649a1c1c91008f82d25f6ceaff664c869ef971f4f74aa92004e91984bebcb7992c3441d61ef350d3d3ad62ad1275"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--Simple \
perl-XML-Simple"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-XML--NamespaceSupport \
perl-XML--SAX \
perl-XML--SAX--Expat"

inherit rpm
