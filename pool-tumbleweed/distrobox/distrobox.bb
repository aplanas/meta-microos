SUMMARY = "Use any linux distribution inside your terminal"
DESCRIPTION = "Use any Linux distribution inside your terminal. \
Distrobox uses podman or docker to create containers using the Linux distribution of your choice. \
The created container will be tightly integrated with the host, \
allowing sharing of the HOME directory of the user, external storage, \
external USB devices and graphical apps (X11/Wayland), and audio."
LICENSE = "GPL-3.0-only"

PV = "1.5.0.2"

RPM_NAME = "distrobox-1.5.0.2-1.1.noarch.rpm"
RPM_HASH = "3a44676a7f352170757afc34f7bd53a5b2d81d93be419373b720dc88fb220704819fec178d985c8abf2e538c65f7017dca20337e127844667a12300c051492d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "distrobox"

RDEPENDS:${PN} += "/usr/bin/basename \
/usr/bin/find \
/usr/bin/grep \
/usr/bin/sed \
/usr/bin/sh"

inherit rpm
