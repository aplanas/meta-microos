SUMMARY = "Dracut Module to mount a tmpfs overlay on a RO root"
DESCRIPTION = "A dracut module which mounts an overlayfs each on /etc and /var, with the upper \
layer in a tmpfs mount. This is the minimal setup to get a booting system, to \
have a writable /root or /home, additional fstab entries can be added."
LICENSE = "GPL-2.0-or-later"

PV = "1.0+git20220808.cd59f4f"

RPM_NAME = "read-only-root-fs-volatile-1.0+git20220808.cd59f4f-1.4.noarch.rpm"
RPM_HASH = "41e17ab9eb1b9dfdf9c9954babf50d7b3eb9056a759e45eac76c7ab2fd13a158458864a0cce946a924fd4ed01a1bb996c2b33711dc58205e7cc63696982a974e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "read-only-root-fs-volatile"

RDEPENDS:${PN} += "/usr/bin/bash \
dracut"

inherit rpm
