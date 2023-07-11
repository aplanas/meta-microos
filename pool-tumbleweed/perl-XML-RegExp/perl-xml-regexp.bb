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

RPM_NAME = "perl-XML-RegExp-0.04-9.27.noarch.rpm"
RPM_HASH = "7cdc310a171cdf594c4642aeea0d2434b6ef39980cbbe0042631b27c01d361e77b1166c3832d7a7c0ba8b64faff5faa5a90cefd58b21c584ca5e26ed8d73e6b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--RegExp \
perl-XML-RegExp"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
