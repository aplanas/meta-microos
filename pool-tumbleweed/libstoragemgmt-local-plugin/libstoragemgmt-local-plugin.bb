SUMMARY = "Files for HP local pseudo support for libstoragemgmt"
DESCRIPTION = "The libstoragemgmt-local-plugin package contains the plugin for local pseudo \
storage."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.9.8"

RPM_NAME = "libstoragemgmt-local-plugin-1.9.8-1.2.noarch.rpm"
RPM_HASH = "d8f38ec9208e77510473ff0eb27dda697af2693e7d863efbde96a4a20d3bf80738614ed94104915ec6ed737094357aa3af8b580c3843522a6ad86fb272fcd4d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-libstoragemgmt-local-plugin \
libstoragemgmt-local-plugin"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python-abi \
python3-libstoragemgmt"

inherit rpm
