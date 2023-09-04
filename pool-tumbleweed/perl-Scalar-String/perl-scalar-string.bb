SUMMARY = "String Aspects of Scalars"
DESCRIPTION = "This module is about the string part of plain Perl scalars. A scalar has a \
string value, which is notionally a sequence of Unicode codepoints, but may \
be internally encoded in either ISO-8859-1 or UTF-8. In places, and more so \
in older versions of Perl, the internal encoding shows through. To fully \
understand Perl strings it is necessary to understand these implementation \
details. \
 \
This module provides functions to classify a string by encoding and to \
encode a string in a desired way. \
 \
This module is implemented in XS, with a pure Perl backup version for \
systems that can't handle XS."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.003"

RPM_NAME = "perl-Scalar-String-0.003-1.30.aarch64.rpm"
RPM_HASH = "8db275dfe82d16e69d66c67da475dea06f1f33a14fd5b5ef30eee3f78d4128b6383d4f0fb468846ddb176a5e1115d1fa7c3cb5ba1033b3a43598e14c9cdc7fb0"

RPROVIDES:${PN} += "perl-Scalar--String \
perl-Scalar-String"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-parent"

inherit rpm
