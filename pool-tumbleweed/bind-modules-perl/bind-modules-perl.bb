SUMMARY = "A dynamically loadable zone (DLZ) plugin embedding a Perl interpreter in BIND"
DESCRIPTION = "This package includes a dynamically loadable zone (DLZ) plugin \
embedding a Perl interpreter in BIND, allowing Perl scripts \
to be written to integrate with BIND and serve DNS data."
LICENSE = "MPL-2.0"

PV = "9.18.17"

RPM_NAME = "bind-modules-perl-9.18.17-1.2.aarch64.rpm"
RPM_HASH = "9b0f908afea2c04fbefc1ddf245a5e3981a407f7623a4c8df8793ec5722c42175fe8a4efc726510a57fa7908d3d293eac1cbaa53aa17cb288a0c11b0e35cf277"

RPROVIDES:${PN} += "bind-modules-perl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libperl.so"

inherit rpm
