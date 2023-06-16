SUMMARY = "MicroOS Desktop default settings"
DESCRIPTION = "This package installs MicroOS default applications for Plasma."
LICENSE = "BSD-3-Clause"

PV = "20230519"

RPM_NAME = "plasma-branding-MicroOS-20230519-1.1.noarch.rpm"
RPM_HASH = "a3d6640b1d89ea8d59015efbc9a02b08b05f4507463eb0c2e5f7525b9f3f3971c3ee8ebb1fabad4fe4786cf06210a1e1e66f94523fd572231bdf27925335df63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-plasma-branding-MicroOS \
plasma-branding-MicroOS"

RDEPENDS:${PN} += "/usr/bin/sh \
flatpak \
kdialog \
libqt5-qdbus \
sound-theme-freedesktop \
transactional-update"

inherit rpm
