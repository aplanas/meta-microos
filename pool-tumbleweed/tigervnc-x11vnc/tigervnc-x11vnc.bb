SUMMARY = "Wrapper that starts x0vncserver"
DESCRIPTION = "This is a wrapper that looks like x11vnc, but starts x0vncserver instead. \
It maps common x11vnc arguments to x0vncserver arguments."
LICENSE = "GPL-2.0-only & MIT"

PV = "1.13.1"

RPM_NAME = "tigervnc-x11vnc-1.13.1-3.3.noarch.rpm"
RPM_HASH = "453cf0f1d13fdd8ab82b1bc45904c2539e923e11b19319ed0311db8ae3d99d1d27054e38b71d9a177332e94ec9d7ec2917655972b6f9c17d54664371f447f34a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tigervnc-x11vnc \
x11vnc"

RDEPENDS:${PN} += "/usr/bin/python3 \
xorg-x11-Xvnc"

inherit rpm
