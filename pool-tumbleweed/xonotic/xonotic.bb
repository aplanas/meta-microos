SUMMARY = "Fast-paced first person shooter"
DESCRIPTION = "Fast-paced first-person shooter that works on Windows, OS X and Linux. The project is geared towards providing addictive arena shooter gameplay which is all spawned and driven by the community itself. Being a direct successor of the Nexuiz project with years of development between them, and it aims to become the best possible open-source FPS (first-person-shooter) of its kind."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.6"

RPM_NAME = "xonotic-0.8.6-1.1.aarch64.rpm"
RPM_HASH = "fb2c88142f14456932e2e4ad391f51bdfc62f2184507805d1b829d8aceb094ac21830d700ce2b10c1bddfa31a19f421f8c4a13f929a17bf694bf54614b276307"

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
