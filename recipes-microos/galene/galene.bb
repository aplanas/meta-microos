SUMMARY = "Galène videoconferencing server"
DESCRIPTION = "Galène is a videoconferencing server implemented in Go which can be \
deployed with moderate server resources."
LICENSE = "MIT"

PV = "0.6.1"

RPM_NAME = "galene-0.6.1-1.3.aarch64.rpm"
RPM_HASH = "c156c5e563d1c484754fc985dc6a085e00b44b2e1258e97e20d2e6cfb24473733a63ea61f1e5dc2a08a9ae19e3720c8408729e23ba429e9294b6d0dca4c46a32"

RPROVIDES:${PN} += "config(galene) galene galene(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch fdupes filesystem fillup libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
