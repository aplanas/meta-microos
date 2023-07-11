SUMMARY = "Galène videoconferencing server"
DESCRIPTION = "Galène is a videoconferencing server implemented in Go which can be \
deployed with moderate server resources."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "galene-0.7.1-1.1.aarch64.rpm"
RPM_HASH = "10d023163937c76db3f2cfa7d07461c4a7ef0ff1a3ab5db365dd56d18515c85f63a716de421a27603143c32d7ecfb4863ea4766501cd80b555b5dfb6b954261d"

RPROVIDES:${PN} += "config-galene \
galene"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fdupes \
filesystem \
fillup \
libc.so.6"

inherit rpm
