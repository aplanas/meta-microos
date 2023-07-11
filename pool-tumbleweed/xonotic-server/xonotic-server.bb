SUMMARY = "Dedicated xonotic server first person shooter"
DESCRIPTION = "Xonotic is a free (GPL), fast-paced first-person shooter that works on Windows, OS X and Linux. The project is geared towards providing addictive arena shooter gameplay which is all spawned and driven by the community itself. Xonotic is a direct successor of the Nexuiz project with years of development between them, and it aims to become the best possible open-source FPS (first-person-shooter) of its kind. \
 \
Server with dedicated xonotic running as services unter the specific user. \
service is handle via systemd or init - depends on your version."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.6"

RPM_NAME = "xonotic-server-0.8.6-1.1.aarch64.rpm"
RPM_HASH = "8dfaa1512d35d5d6cc6a5c8357153b8c5d0a880f4b8cffdf004576ffc496923156a904e39867124ae1dadb065ec777ac5356134be898df6751b00c5e5a127a01"

RPROVIDES:${PN} += "xonotic-server"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libd0-blind-id.so.0 \
libjpeg.so.8 \
libm.so.6 \
libz.so.1 \
shadow \
systemd \
xonotic-data"

inherit rpm
