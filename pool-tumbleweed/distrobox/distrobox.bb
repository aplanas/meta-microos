SUMMARY = "Use any linux distribution inside your terminal"
DESCRIPTION = "Use any Linux distribution inside your terminal. \
Distrobox uses podman or docker to create containers using the Linux distribution of your choice. \
The created container will be tightly integrated with the host, \
allowing sharing of the HOME directory of the user, external storage, \
external USB devices and graphical apps (X11/Wayland), and audio."
LICENSE = "GPL-3.0-only"

PV = "1.5.0"

RPM_NAME = "distrobox-1.5.0-1.1.noarch.rpm"
RPM_HASH = "55b110804bec749823c276576deb57b730109d5bba619d050c302b5c061dc8ab0a175481da1ffa7cf2eec93c704a588a1793683dbd36215e0917f1ffad64f4c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "distrobox"

RDEPENDS:${PN} += "/usr/bin/basename \
/usr/bin/find \
/usr/bin/grep \
/usr/bin/sed \
/usr/bin/sh"

inherit rpm
