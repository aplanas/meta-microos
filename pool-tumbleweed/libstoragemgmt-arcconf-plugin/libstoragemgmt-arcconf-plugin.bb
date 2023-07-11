SUMMARY = "Files for Microsemi storage support for libstoragemgmt"
DESCRIPTION = "The libstoragemgmt-arcconf-plugin package contains the plugin for Microsemi \
storage."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.9.8"

RPM_NAME = "libstoragemgmt-arcconf-plugin-1.9.8-1.2.noarch.rpm"
RPM_HASH = "574cd35e49e499b19ea6149515160de91fcda79a436d6c5c9e4125eac915fb7357f5b46d418833aa5b38cb2b11acec8f1e60558aa5bac11d9a83ee86a537cfd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-libstoragemgmt-arcconf-plugin \
libstoragemgmt-arcconf-plugin"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python-abi \
python3-libstoragemgmt"

inherit rpm
