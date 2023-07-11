SUMMARY = "Spooky::Patterns::XS Perl module"
DESCRIPTION = "Spooky::Patterns::XS Perl module"
LICENSE = "GPL-2.0-or-later"

PV = "1.55"

RPM_NAME = "perl-Spooky-Patterns-XS-1.55-3.10.aarch64.rpm"
RPM_HASH = "1ca78231e3604c976b1b662a17b0e4103c93eb2898553eb70d90df6981b6a7efe6ec33639a58d21c9d3ed6047ec8ca1acaeae4fc6cdda00fa52cb1e9c1eedf87"

RPROVIDES:${PN} += "perl-Spooky--Patterns--XS \
perl-Spooky--Patterns--XS--Hash \
perl-Spooky-Patterns-XS"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
