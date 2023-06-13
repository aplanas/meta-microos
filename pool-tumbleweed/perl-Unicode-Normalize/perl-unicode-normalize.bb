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

RPM_NAME = "perl-Unicode-Normalize-1.26-1.19.aarch64.rpm"
RPM_HASH = "7e309ac4be639c1c4fd5ae0f23c6930324e646001ecddac0b632f00e50cf71e215352d8a0dc25e6718a6c7f00b938838678b867f9c1fc1fe4d65062a5544aa25"

RPROVIDES:${PN} += "perl(Unicode::Normalize) \
perl-Unicode-Normalize \
perl-Unicode-Normalize(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
