SUMMARY = "Development Libraries and Header Files for Free cWnn"
DESCRIPTION = "This package contains the header files and libraries for building \
client programs that use the Chinese Input System, Free cWnn."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.1a023.1"

RPM_NAME = "fcwnn-devel-1.1.1a023.1-4.4.aarch64.rpm"
RPM_HASH = "a62926fca2ce3fc84659777bb6074894abf79d1e26c5cd37632ed4380fbfea8fec111afe43a91263085533bc62e8f0b82c3154a95d94d4a9a71a1dd352d19529"

RPROVIDES:${PN} += "fcwnn-devel \
fcwnndev"

RDEPENDS:${PN} += "fcwnn \
libcwnn0"

inherit rpm
