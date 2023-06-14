SUMMARY = "Header files for libShadowDive"
DESCRIPTION = "Development and header files for libShadowDive."
LICENSE = "MIT"

PV = "0.6.5+git.20190205"

RPM_NAME = "shadowdive-devel-0.6.5+git.20190205-3.12.aarch64.rpm"
RPM_HASH = "b3005ec0b775980b7b26a5882b0c5bf304977551e9819d3b2fee9816f15f29c5b162a96b8a6a376dfe8ceb3ef5fd70961df207afcdc8c80131f3eee03eb2d52b"

RPROVIDES:${PN} += "shadowdive-devel"

RDEPENDS:${PN} += "libpng16-compat-devel \
libshadowdive0-0-0-suse"

inherit rpm
