SUMMARY = "Use any linux distribution inside your terminal"
DESCRIPTION = "Use any Linux distribution inside your terminal. \
Distrobox uses podman or docker to create containers using the Linux distribution of your choice. \
The created container will be tightly integrated with the host, \
allowing sharing of the HOME directory of the user, external storage, \
external USB devices and graphical apps (X11/Wayland), and audio."
LICENSE = "GPL-3.0-only"

PV = "1.4.2.1"

RPM_NAME = "distrobox-1.4.2.1-3.1.noarch.rpm"
RPM_HASH = "50ad9b0e1d026015c0f81e192571bb558f53f9d7c49e8ff44358904a0a9584645f2dbdc909322ab1872c9731ce435d98e99a749a30b9691097e13260bbd79c94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "distrobox"
RDEPENDS:${PN} += "(/usr/bin/podman or /usr/bin/docker) (distrobox-bash-completion if bash-completion) /bin/sh /usr/bin/basename /usr/bin/find /usr/bin/grep /usr/bin/sed"

inherit rpm
