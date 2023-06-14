SUMMARY = "A dynamically loadable zone (DLZ) plugin embedding a Perl interpreter in BIND"
DESCRIPTION = "This package includes a dynamically loadable zone (DLZ) plugin \
embedding a Perl interpreter in BIND, allowing Perl scripts \
to be written to integrate with BIND and serve DNS data."
LICENSE = "MPL-2.0"

PV = "9.18.15"

RPM_NAME = "bind-modules-perl-9.18.15-1.1.aarch64.rpm"
RPM_HASH = "73387adcfd5bf9a6246229b06b2f210ae8ee695dee2f12a0554de6976b70fe0c1cb1e2d85c344b0c56f6f4bc27c3fe39185093729f842abd3cab9b287e364fee"

RPROVIDES:${PN} += "bind-modules-perl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libperl.so"

inherit rpm
