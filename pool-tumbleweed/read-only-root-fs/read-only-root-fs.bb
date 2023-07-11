SUMMARY = "Files and Scripts for a RO root fileystem"
DESCRIPTION = "Files, scripts and directories to run the system with a \
read-only root filesystem with /etc writeable via overlayfs. \
 \
This package should never be installed in an already running \
system! It should only be selected by a system role for a \
read-only root filesystem with transactional updates. \
The package will create / modify entries for mounting /etc and /var. \
Those entries are used by dracut to mount the overlay file systems \
during the early boot phase."
LICENSE = "GPL-2.0-or-later"

PV = "1.0+git20220808.cd59f4f"

RPM_NAME = "read-only-root-fs-1.0+git20220808.cd59f4f-1.4.noarch.rpm"
RPM_HASH = "ec30aa5aabdf223a2fe0e0b125608271f92882921d1c51643f096eca319d31c060822a1b7df98c1c36aa4b1b8633720d403170498aa4b59605e920f82619bac4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-read-only-root-fs \
read-only-root-fs"

RDEPENDS:${PN} += "/usr/bin/cat \
/usr/bin/mkdir \
/usr/bin/sed \
/usr/bin/sh \
dracut \
gawk \
snapper"

inherit rpm
