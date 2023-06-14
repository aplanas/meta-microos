SUMMARY = "X"
DESCRIPTION = "Cache for X.Org compose files."
LICENSE = "MIT"

PV = "7.6"

RPM_NAME = "xorg-x11-libX11-ccache-7.6-22.6.aarch64.rpm"
RPM_HASH = "33cf6a1b0a41f7e41268cc1db3371df2084922fe4ce797de43f3bf15b9b4d7272c30aefefe5be1f4537fce1975fd507d5e5b5e26e0f7b0e7921388e5695bcb21"

RPROVIDES:${PN} += "xorg-x11-/var/X11R6/compose-cache/ \
xorg-x11-libX11-ccache"

RDEPENDS:${PN} += ""

inherit rpm
