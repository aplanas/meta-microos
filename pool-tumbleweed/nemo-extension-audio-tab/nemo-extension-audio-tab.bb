SUMMARY = "Audio tag information for Nemo file manager"
DESCRIPTION = "View audio tag information from the file manager's properties tab."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.0"

RPM_NAME = "nemo-extension-audio-tab-5.2.0-3.6.noarch.rpm"
RPM_HASH = "2949070349968217e4b90fb26b16080ffe15ae2383f6890446bd98a4d501caeb3bd97cbc6db7f57768939bedd7471b06c672f0b5059a07bf2d7e8afe487174bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nemo-extension-audio-tab \
python3.11dist-nemo-audio-tab \
python3dist-nemo-audio-tab"

RDEPENDS:${PN} += "/usr/bin/python3 \
nemo \
python3-mutagen \
python3-nemo \
typelib-GObject \
typelib-Gio \
typelib-Gtk \
typelib-Nemo"

inherit rpm
