SUMMARY = "Play your Windows games on GNU/Linux"
DESCRIPTION = "PlayOnLinux is a piece of software which allows you to easily install and use \
numerous games and apps designed to run with Microsoft Windows. \
Few games are compatible with GNU/Linux at the moment and it certainly is \
a factor preventing the migration to this system. \
PlayOnLinux brings a cost-free, accessible and efficient solution to this problem."
LICENSE = "GPL-3.0-only"

PV = "4.4.0"

RPM_NAME = "PlayOnLinux-4.4.0-2.3.noarch.rpm"
RPM_HASH = "5dd964a37b70cfddb97c1c1a97e8364d4a939c16478de52886b338ed9a2d00ca8c978f05cae8c182e1c20a23203e579ca1399648528aefd06de5fe4408c3fdf9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "PlayOnLinux application() application(PlayOnLinux.desktop)"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/python3 ImageMagick gettext icoutils jq p7zip-full python3 python3-natsort python3-wxPython unzip wget wine xterm"

inherit rpm
