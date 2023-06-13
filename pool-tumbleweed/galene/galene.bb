SUMMARY = "Galène videoconferencing server"
DESCRIPTION = "Galène is a videoconferencing server implemented in Go which can be \
deployed with moderate server resources."
LICENSE = "MIT"

PV = "0.6.1"

RPM_NAME = "galene-0.6.1-1.4.aarch64.rpm"
RPM_HASH = "9e57e64553e3098f50be70189ab7efed827de1e224f8a382b59d371260e2a61d1bc1910f00147ae3db0a4f2b2bffae968fa6ee0eef183180b1516cd8b79b6f29"

RPROVIDES:${PN} += "config(galene) \
galene \
galene(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
fdupes \
filesystem \
fillup \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
