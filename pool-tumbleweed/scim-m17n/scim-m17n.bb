SUMMARY = "M17N Input Method Engine for SCIM"
DESCRIPTION = "M17N Input Method Engine for SCIM \
 \
Supports all input methods offered by m17n-lib and m17n-db. \
 \
Currently the following languages are supported: \
 \
Amharic, Arabic, Armenian, Assamese, Bengali, Chinese, Croatian, \
Devanagari, Dhivehi, Farsi, Georgian Greek, Gujarati, Hebrew, Japanese, \
Kannada, Kazakh, Khmer, Korean, Lao, Malayalam, Myanmar, Oriya, \
Punjabi, Russian, Serbian, Sinhala, Slovak, Syriac, Tamil, Telugu, \
Thai, Tibetan, Vietnamese \
 \
Several generic input methods for languages based on the Latin alphabet \
are also included."
LICENSE = "GPL-2.0+"

PV = "0.2.3"

RPM_NAME = "scim-m17n-0.2.3-6.29.aarch64.rpm"
RPM_HASH = "da6f412d676b73df808e223aa1bd490659a1935063c085e84e89764e2ccd816da1188c6338677282d894a09b6c1d1e4edcd0b0a77fad4150719f2a01419c33ab"

RPROVIDES:${PN} += "scim-m17n"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm17n-core.so.0 \
libm17n.so.0 \
libscim-1.0.so.8 \
libstdc++.so.6"

inherit rpm
