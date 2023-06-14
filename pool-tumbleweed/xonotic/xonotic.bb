SUMMARY = "Fast-paced first person shooter"
DESCRIPTION = "Fast-paced first-person shooter that works on Windows, OS X and Linux. The project is geared towards providing addictive arena shooter gameplay which is all spawned and driven by the community itself. Being a direct successor of the Nexuiz project with years of development between them, and it aims to become the best possible open-source FPS (first-person-shooter) of its kind."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.5"

RPM_NAME = "xonotic-0.8.5-1.5.aarch64.rpm"
RPM_HASH = "654852d48eec6674c9a11f6cf5d05828dc72c31cc992dca8c6e2ec2f6def7be570028f3ffb123088e9847fd7c646d15d4c9faa5deccf3215ca3530814359994c"

RPROVIDES:${PN} += "xonotic"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libX11.so.6 \
libXext.so.6 \
libXpm.so.4 \
libXxf86vm.so.1 \
libasound.so.2 \
libc.so.6 \
libd0-blind-id.so.0 \
libjpeg.so.8 \
libm.so.6 \
libz.so.1 \
logrotate \
xonotic-data"

inherit rpm
