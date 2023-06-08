SUMMARY = "A dynamically loadable zone (DLZ) plugin embedding a Perl interpreter in BIND"
DESCRIPTION = "This package includes a dynamically loadable zone (DLZ) plugin \
embedding a Perl interpreter in BIND, allowing Perl scripts \
to be written to integrate with BIND and serve DNS data."
LICENSE = "MPL-2.0"

PV = "9.18.14"

RPM_NAME = "bind-modules-perl-9.18.14-1.1.aarch64.rpm"
RPM_HASH = "c0f0774c0853abb5a4d46343186b79355e2412d640b8ee22a497f3b32d7fc236c299a28812be1c01dacf8768dc0f318595e569e8dfec254824659e02df919b48"

RPROVIDES:${PN} += "bind-modules-perl bind-modules-perl(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libperl.so()(64bit)"

inherit rpm
