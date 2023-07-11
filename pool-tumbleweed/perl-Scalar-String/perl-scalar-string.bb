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

RPM_NAME = "perl-Scalar-String-0.003-1.29.aarch64.rpm"
RPM_HASH = "1d6a7d37946cb3e86aeb38ef5c47fb867e35ccc9d71b694215bafcb10319969e357da3b40b575130dd3be8cbabf6461a42e9ab66cc5df0f32b0416054b6262fb"

RPROVIDES:${PN} += "perl-Scalar--String \
perl-Scalar-String"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-parent"

inherit rpm
