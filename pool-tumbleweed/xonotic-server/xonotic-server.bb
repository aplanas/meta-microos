SUMMARY = "Dedicated xonotic server first person shooter"
DESCRIPTION = "Xonotic is a free (GPL), fast-paced first-person shooter that works on Windows, OS X and Linux. The project is geared towards providing addictive arena shooter gameplay which is all spawned and driven by the community itself. Xonotic is a direct successor of the Nexuiz project with years of development between them, and it aims to become the best possible open-source FPS (first-person-shooter) of its kind. \
 \
Server with dedicated xonotic running as services unter the specific user. \
service is handle via systemd or init - depends on your version."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.5"

RPM_NAME = "xonotic-server-0.8.5-1.5.aarch64.rpm"
RPM_HASH = "19f6f27e60f1e626839149411d59766bdd7245f5572344e3a7eb4dd16d19ebe64a2104d27e22cc56cce9ccdc8bd064a363be93d44e09fcce3250fa020cc0cb8f"

RPROVIDES:${PN} += "xonotic-server \
xonotic-server(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libd0_blind_id.so.0()(64bit) \
libjpeg.so.8()(64bit) \
libm.so.6()(64bit) \
libz.so.1()(64bit) \
shadow \
systemd \
xonotic-data"

inherit rpm
