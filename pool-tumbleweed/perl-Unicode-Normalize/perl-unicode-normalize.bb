SUMMARY = "Unicode Normalization Forms"
DESCRIPTION = "Parameters: \
 \
'$string' is used as a string under character semantics (see perlunicode). \
 \
'$code_point' should be an unsigned integer representing a Unicode code \
point. \
 \
Note: Between XSUB and pure Perl, there is an incompatibility about the \
interpretation of '$code_point' as a decimal number. XSUB converts \
'$code_point' to an unsigned integer, but pure Perl does not. Do not use a \
floating point nor a negative sign in '$code_point'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.26"

RPM_NAME = "perl-Unicode-Normalize-1.26-1.21.aarch64.rpm"
RPM_HASH = "497ad9dd5c00b1e7a03d7adfaaba516782963b78c95974c381981c9c0297b62fe87656af1a5d17280c0304e8368def24f6c259083ba970cdc2f5090cc7e9ea55"

RPROVIDES:${PN} += "perl-Unicode--Normalize \
perl-Unicode-Normalize"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
