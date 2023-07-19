SUMMARY = "Audio tag information for Nemo file manager"
DESCRIPTION = "View audio tag information from the file manager's properties tab."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.0"

RPM_NAME = "nemo-extension-audio-tab-5.2.0-4.1.noarch.rpm"
RPM_HASH = "b6387eb5430f0e4f4dbb58659afcde21c56b738934316c0a6d6ed290e47937c0a35517d970e273bc83723aac73a4fd6204734caaece6e5e3f494f9c65085fbf8"
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
