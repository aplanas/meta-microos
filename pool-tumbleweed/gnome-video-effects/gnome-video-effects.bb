SUMMARY = "Collection of GStreamer effects"
DESCRIPTION = "A collection of GStreamer effects to be used in different GNOME Modules."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.0"

RPM_NAME = "gnome-video-effects-0.6.0-1.1.noarch.rpm"
RPM_HASH = "c5ce58200715493c67653f9495dc6499db7f76f3d85e81c34b1a44d572f6d8eb899fd702bcad1afb5070f04ae239d7d05198665bd6bc78bd0ceb640dce48ae34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-video-effects"

RDEPENDS:${PN} += ""

inherit rpm
