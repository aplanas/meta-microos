SUMMARY = "Sndio output plugin for the C* Music Player"
DESCRIPTION = "This package provides sndio output support for the C* Music Player."
LICENSE = "GPL-2.0-only"

PV = "2.10.0"

RPM_NAME = "cmus-plugin-sndio-2.10.0-1.8.aarch64.rpm"
RPM_HASH = "7e33c6060b085c7bfa1042bcf1a8d648a4073c892b03efd72ad698e6fe379cef0d4f7f598aea3f561c11b40bee2a82cd3591364a2c363f3aa95c7d0046ed1f06"

RPROVIDES:${PN} += "cmus-plugin-sndio cmus-plugin-sndio(aarch-64)"
RDEPENDS:${PN} += "cmus libsndio.so.7.1()(64bit)"

inherit rpm
