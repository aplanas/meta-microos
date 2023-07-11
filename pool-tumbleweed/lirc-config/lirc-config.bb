SUMMARY = "LIRC Configuration Tools and Data"
DESCRIPTION = "The LIRC config package contains tools and data  to ease the \
LIRC configuration process."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.1"

RPM_NAME = "lirc-config-0.10.1-10.2.noarch.rpm"
RPM_HASH = "701f64c96da5131c20b127e66561bd2bbb95ace6e5228113bc5502d792120e979da1deb7c23c65b05eab73d66f8049ed954800489a21111cf2111174f9aa7de2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lirc-config \
lirc-remotes"

RDEPENDS:${PN} += "lirc-core \
python3-PyYAML \
python3-gobject"

inherit rpm
