SUMMARY = "A dynamically loadable zone (DLZ) plugin embedding a Perl interpreter in BIND"
DESCRIPTION = "This package includes a dynamically loadable zone (DLZ) plugin \
embedding a Perl interpreter in BIND, allowing Perl scripts \
to be written to integrate with BIND and serve DNS data."
LICENSE = "MPL-2.0"

PV = "9.18.16"

RPM_NAME = "bind-modules-perl-9.18.16-3.1.aarch64.rpm"
RPM_HASH = "98cf897cc0fbd169418df5d5cbf0886fa5bd594234eee258957a626e5ffef8d8e78f3aca1c7e7aa05af4d37d684b448279bbf9976db003a4c8a22b6b02f97ff0"

RPROVIDES:${PN} += "bind-modules-perl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libperl.so"

inherit rpm
