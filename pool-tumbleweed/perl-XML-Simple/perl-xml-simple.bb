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

RPM_NAME = "perl-XML-Simple-2.25-1.19.noarch.rpm"
RPM_HASH = "df479a4582860789768627e69c92dff9ca5cb7b3c9df513952850d2971758e5b23f6ade7406fd978affc44fcdc2791652a2751945868f1648b5a60bc5dc74e7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--Simple \
perl-XML-Simple"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-XML--NamespaceSupport \
perl-XML--SAX \
perl-XML--SAX--Expat"

inherit rpm
