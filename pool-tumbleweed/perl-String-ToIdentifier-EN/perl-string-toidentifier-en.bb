SUMMARY = "Convert Strings to English Program Identifiers"
DESCRIPTION = "This module provides a utility method, to_identifier for converting an \
arbitrary string into a readable representation using the ASCII subset of \
'\\w' for use as an identifier in a computer program. The intent is to make \
unique identifier names from which the content of the original string can \
be easily inferred by a human just by reading the identifier. \
 \
If you need the full set of '\\w' including Unicode, see the subclass \
String::ToIdentifier::EN::Unicode. \
 \
Currently, this process is one way only, and will likely remain this way. \
 \
The default is to create camelCase identifiers, or you may pass in a \
separator char of your choice such as '_'. \
 \
Binary char groups will be separated by '_' even in camelCase identifiers \
to make them easier to read, e.g.: 'foo_2_0xFF_Bar'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.12"

RPM_NAME = "perl-String-ToIdentifier-EN-0.12-1.19.noarch.rpm"
RPM_HASH = "943153ade20c30e97f3c79eb686dd0e0565c9cd5a892c69538ae737d675bc21e4dccef027ad5515b5b4415175cf464ff7f7d2b6be90b88083501039e6103a166"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-String--ToIdentifier--EN \
perl-String--ToIdentifier--EN--Unicode \
perl-String-ToIdentifier-EN"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Lingua--EN--Inflect--Phrase \
perl-Text--Unidecode \
perl-namespace--clean"

inherit rpm
