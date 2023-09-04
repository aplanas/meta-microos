SUMMARY = "Spooky::Patterns::XS Perl module"
DESCRIPTION = "Spooky::Patterns::XS Perl module"
LICENSE = "GPL-2.0-or-later"

PV = "1.55"

RPM_NAME = "perl-Spooky-Patterns-XS-1.55-3.11.aarch64.rpm"
RPM_HASH = "28f0b95265a54900ea29b6266bf22b6974a44f45561667a0cfaa519773ce37fe23e4a6278efc1939870e12cda7a7dbec6cc22d5b4985476686cf99fe851cfa7d"

RPROVIDES:${PN} += "perl-Spooky--Patterns--XS \
perl-Spooky--Patterns--XS--Hash \
perl-Spooky-Patterns-XS"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
