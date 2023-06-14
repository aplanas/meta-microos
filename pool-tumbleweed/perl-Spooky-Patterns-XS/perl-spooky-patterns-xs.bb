SUMMARY = "Spooky::Patterns::XS Perl module"
DESCRIPTION = "Spooky::Patterns::XS Perl module"
LICENSE = "GPL-2.0-or-later"

PV = "1.55"

RPM_NAME = "perl-Spooky-Patterns-XS-1.55-3.9.aarch64.rpm"
RPM_HASH = "a9f727be356e851824940fd1178c54640b92b765d9f5f500821c3f126b0c2cfc5b7c8c5001749764c0e1b4556d07a1460cc73220d2461ecfa77e26ac01b5b773"

RPROVIDES:${PN} += "perl-Spooky--Patterns--XS \
perl-Spooky--Patterns--XS--Hash \
perl-Spooky-Patterns-XS"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
perl--MODULE-COMPAT-5.36.0"

inherit rpm
