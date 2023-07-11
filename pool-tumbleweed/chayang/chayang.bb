SUMMARY = "Gradual screen dimmer"
DESCRIPTION = "A program that gradually dims the screen. \
It can be used to implement a grace period before locking the session."
LICENSE = "MIT"

PV = "git20230209.61ad53b"

RPM_NAME = "chayang-git20230209.61ad53b-1.1.aarch64.rpm"
RPM_HASH = "2f9a32974607284138f36b266bdad2ac1ffbac333fe5a3bd837acc72a80fd36ead9a8a12906c83d08bce53a93393f5d41da7db6a34b1a41a0887e5f606e94baf"

RPROVIDES:${PN} += "chayang"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libwayland-client.so.0"

inherit rpm
