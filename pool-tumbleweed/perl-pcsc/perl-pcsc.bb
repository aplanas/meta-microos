SUMMARY = "Perl interface to Smart Card Reader"
DESCRIPTION = "PC/SC represents an abstraction layer to smart card readers. It \
provides a communication layer with a wide variety of smart card \
readers through a standardized API."
LICENSE = "GPL-2.0+"

PV = "1.4.14"

RPM_NAME = "perl-pcsc-1.4.14-1.34.aarch64.rpm"
RPM_HASH = "831b0f9deeb855fd87eb9c472e0b1dfb86e87a342fadfb69e1987aec61fcea6aa1d4562d748c2c5575cec6bece35561d6d274c650ad05dfefefee1dff640af32"

RPROVIDES:${PN} += "perl-Chipcard--PCSC \
perl-Chipcard--PCSC--Card \
perl-pcsc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1 \
perl-base"

inherit rpm
