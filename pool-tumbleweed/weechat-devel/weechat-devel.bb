SUMMARY = "Development Environment for weechat Plugins"
DESCRIPTION = "Development environment for authoring weechat plugins."
LICENSE = "GPL-3.0-or-later"

PV = "4.0.2"

RPM_NAME = "weechat-devel-4.0.2-1.1.aarch64.rpm"
RPM_HASH = "58be7fc20ac3df56b82de157bea8256cd50e7060188ad0529de6d72e91f1cc32f87ff46e6c5e108a22886ef64d1811787ac65fb6633473d321b0d900cd3fca1b"

RPROVIDES:${PN} += "pkgconfig-weechat \
weechat-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
weechat"

inherit rpm
