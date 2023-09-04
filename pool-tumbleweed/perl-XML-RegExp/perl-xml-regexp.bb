SUMMARY = "Regular expressions for XML tokens"
DESCRIPTION = "This package contains regular expressions for the following XML tokens: \
BaseChar, Ideographic, Letter, Digit, Extender, CombiningChar, NameChar, \
EntityRef, CharRef, Reference, Name, NmToken, and AttValue. \
 \
The definitions of these tokens were taken from the XML spec (Extensible \
Markup Language 1.0) at the http://www.w3.org/TR/REC-xml manpage. \
 \
Also contains the regular expressions for the following tokens from the XML \
Namespaces spec at the http://www.w3.org/TR/REC-xml-names manpage: \
NCNameChar, NCName, QName, Prefix and LocalPart."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.04"

RPM_NAME = "perl-XML-RegExp-0.04-9.28.noarch.rpm"
RPM_HASH = "aea0bf67175c40325447507e1fcfaca71d54a3f247ca48376cdaf41917c9106cbf18537b8aba2859a64e3299d8aa73d9f4175a9e8167ab87f881c75dcff72daf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--RegExp \
perl-XML-RegExp"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
