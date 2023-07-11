SUMMARY = "A dynamically loadable zone (DLZ) plugin embedding a Perl interpreter in BIND"
DESCRIPTION = "This package includes a dynamically loadable zone (DLZ) plugin \
embedding a Perl interpreter in BIND, allowing Perl scripts \
to be written to integrate with BIND and serve DNS data."
LICENSE = "MPL-2.0"

PV = "9.18.16"

RPM_NAME = "bind-modules-perl-9.18.16-2.1.aarch64.rpm"
RPM_HASH = "89664f4f6b8fe601f677268417be3f13b16f289f089231e6c3221d2d5f34c53982750b82b5856e82e8abdc91b3984ccb4336a8734dd411dd6c12675023779211"

RPROVIDES:${PN} += "bind-modules-perl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libperl.so"

inherit rpm
