SUMMARY = "Terminal based emoji chooser"
DESCRIPTION = "moji is a terminal based emoji chooser for *nix. With tuimoji you can search and browse emojis and copy them to your clipboard without ever leaving the comfort of your terminal."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.0"

RPM_NAME = "tuimoji-1.0.0-1.10.noarch.rpm"
RPM_HASH = "e37cc45b148b31bff72f686aee1a32157e906c3e1f31e25f4fddd47f42261efd30579186235dac005d95a659021043f59542a4ad8848aa82a87c14aaccf2549b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-tuimoji \
python3dist-tuimoji \
tuimoji"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-urwid \
xclip"

inherit rpm
