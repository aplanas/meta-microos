SUMMARY = "Text-based GNU social client"
DESCRIPTION = "GnuSocialShell is a text-based GNU social client written in C."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.0"

RPM_NAME = "gnusocialshell-1.3.0-1.20.aarch64.rpm"
RPM_HASH = "eb42d84d5d4b8326f3263d19d215084b43c6f5f8fb3ba749e68406e56efaf6dedf48560d54506693a2e1a664dbaa8a69078548140543d8a2ba8bea2337111eff"

RPROVIDES:${PN} += "gnusocialshell"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libreadline.so.8"

inherit rpm
