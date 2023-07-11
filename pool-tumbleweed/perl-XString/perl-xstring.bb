SUMMARY = "Isolated String helpers from B"
DESCRIPTION = "XString provides the B string helpers in one isolated package. Right now \
only cstring and perlstring are available."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.005"

RPM_NAME = "perl-XString-0.005-1.16.aarch64.rpm"
RPM_HASH = "c1f849fc9bc46183557be146cb8514c6bf3a4327e6c24ec815cf5ded04829377940e8c2e2b793c6fb3811369dfe2d824e0ceeca6bfb69bbf251e6a7c059a4d92"

RPROVIDES:${PN} += "perl-XString"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
