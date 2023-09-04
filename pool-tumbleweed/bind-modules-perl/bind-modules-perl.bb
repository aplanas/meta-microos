SUMMARY = "A dynamically loadable zone (DLZ) plugin embedding a Perl interpreter in BIND"
DESCRIPTION = "This package includes a dynamically loadable zone (DLZ) plugin \
embedding a Perl interpreter in BIND, allowing Perl scripts \
to be written to integrate with BIND and serve DNS data."
LICENSE = "MPL-2.0"

PV = "9.18.18"

RPM_NAME = "bind-modules-perl-9.18.18-1.1.aarch64.rpm"
RPM_HASH = "f6e9991bc37bd1f504993f7a6d9b280fa0cdc20aba266cc3ee39bbef3227fd670f0b22efdf2a55e2d9c0d30cde9da54322dd84b64fbe1915175ac544e09d049b"

RPROVIDES:${PN} += "bind-modules-perl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libperl.so"

inherit rpm
