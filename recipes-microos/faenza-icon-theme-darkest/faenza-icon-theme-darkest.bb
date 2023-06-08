SUMMARY = "Faenza-Dark Icon Theme"
DESCRIPTION = "This icon theme for GNOME provides monochromatic icons for panels, \
toolbars and buttons and colourful squared icons for devices, \
applications, folder, files and GNOME menu items."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.1"

RPM_NAME = "faenza-icon-theme-darkest-1.3.1-1.4.noarch.rpm"
RPM_HASH = "0cdef373b084abd4cb50688225f1daed8e4711f4305395d2367a631ea375f25d052eeb206d5c327d69af2decb8a9ff2b26bf21b9c9bc7d69699dc10a95a2b1ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "faenza-icon-theme-darkest"
RDEPENDS:${PN} += "/bin/sh faenza-icon-theme-dark"

inherit rpm
