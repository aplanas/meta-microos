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

RPM_NAME = "perl-XML-Simple-2.25-1.17.noarch.rpm"
RPM_HASH = "dcc9e64868a197beb650d15b76e4e206cef120bd232f3e0ee3df9e66e0660e7553346eef7703d91c1132de4342a06cf42a763225003fb84f358ae21b50c48727"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(XML::Simple) \
perl-XML-Simple"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(XML::NamespaceSupport) \
perl(XML::SAX) \
perl(XML::SAX::Expat)"

inherit rpm
