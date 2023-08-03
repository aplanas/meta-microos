SUMMARY = "A dynamically loadable zone (DLZ) plugin embedding a Perl interpreter in BIND"
DESCRIPTION = "This package includes a dynamically loadable zone (DLZ) plugin \
embedding a Perl interpreter in BIND, allowing Perl scripts \
to be written to integrate with BIND and serve DNS data."
LICENSE = "MPL-2.0"

PV = "9.18.17"

RPM_NAME = "bind-modules-perl-9.18.17-1.1.aarch64.rpm"
RPM_HASH = "f30f138d0404066d72e0a3aa1e35c7cee5e0e6d7eb8d03a317313d78c7a8ce3e75da4ff5bce462aa75772caaedb426a6005309374d6507c4b037b546e7861b23"

RPROVIDES:${PN} += "bind-modules-perl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libperl.so"

inherit rpm
