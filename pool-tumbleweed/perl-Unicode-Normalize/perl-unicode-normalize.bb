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

RPM_NAME = "perl-Unicode-Normalize-1.26-1.20.aarch64.rpm"
RPM_HASH = "c3732b786e998c954d098e44d8079e9d35392763950589edd6ac6df2bb411b129fb4cefecf4437769cead0291690724069d49dd9e6f334cadc3afce122326cfa"

RPROVIDES:${PN} += "perl-Unicode--Normalize \
perl-Unicode-Normalize"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
