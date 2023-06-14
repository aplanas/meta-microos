SUMMARY = "Graphical User Interface for the laptop mode tools"
DESCRIPTION = "This package contains a graphical user interface for laptop-mode-tools."
LICENSE = "GPL-2.0-or-later"

PV = "1.74"

RPM_NAME = "laptop-mode-tools-gui-1.74-3.6.noarch.rpm"
RPM_HASH = "9ddcb7ecec3e37f189f886790a78655524972e80c765140a7e08dde7910c968966eee909189d7f4f660912165f2ee525dc4d197a444740f37fda31d3726c13ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "laptop-mode-tools-gui"

RDEPENDS:${PN} += "/bin/sh \
laptop-mode-tools \
python3-qt5"

inherit rpm
