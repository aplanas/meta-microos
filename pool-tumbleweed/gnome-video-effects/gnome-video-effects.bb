SUMMARY = "Collection of GStreamer effects"
DESCRIPTION = "A collection of GStreamer effects to be used in different GNOME Modules."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.0"

RPM_NAME = "gnome-video-effects-0.5.0-3.6.noarch.rpm"
RPM_HASH = "cbea0d4bd13f56fccde174d5e4424cef59b535d5d734fa9020be498838c2f35e7439bad2cf51a81608a0282f8b9a81f20ee63128f3de4518c42b635e0cac3052"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-video-effects"

RDEPENDS:${PN} += ""

inherit rpm
