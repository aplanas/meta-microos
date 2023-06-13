SUMMARY = "Tools using libxml"
DESCRIPTION = "This package contains xmllint, a very useful tool proving libxml's power."
LICENSE = "MIT"

PV = "2.10.4"

RPM_NAME = "libxml2-tools-2.10.4-2.1.aarch64.rpm"
RPM_HASH = "37000d0271ac82fc31bc2e34e23f9dfa85f59f70cff903bba732aa7122c6c1116c9a78f606702b87911ba80bc52e5ead4ffcc0473e18f5f7458c7a3110b0bb03"

RPROVIDES:${PN} += "libxml2 \
libxml2-tools \
libxml2-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libreadline.so.8()(64bit) \
libxml2.so.2()(64bit)"

inherit rpm
