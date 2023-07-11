SUMMARY = "Development library to encode performance events for perf_events interface"
DESCRIPTION = "This package provides development libraries and header files used to encode performance events for perf_events interface."
LICENSE = "MIT"

PV = "4.13.0"

RPM_NAME = "libpfm-devel-4.13.0-1.3.aarch64.rpm"
RPM_HASH = "c97e03f4ba7ae0f47ef9a61d0819a783e60c09b287ead5eb17580c580a46bfd77af6afea92be3184e96616e127786cbedcad547b1f64c64238475dc8f049e1fe"

RPROVIDES:${PN} += "libpfm-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpfm4"

inherit rpm
