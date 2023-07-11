SUMMARY = "Files for LSI MegaRAID support for libstoragemgmt"
DESCRIPTION = "The libstoragemgmt-megaraid-plugin package contains the plugin for LSI MegaRAID \
storage management via storcli."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.9.8"

RPM_NAME = "libstoragemgmt-megaraid-plugin-1.9.8-1.2.noarch.rpm"
RPM_HASH = "a1e841783a6001bf9e44120ddc2652f5aec1fae0d483b41744f2ab5b83da1ac504cfc3e90e50bcbe4abd62b7f2a16c9d68e3aa2a2e1d183b74f600635bf4173a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-libstoragemgmt-megaraid-plugin \
libstoragemgmt-megaraid-plugin"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python-abi \
python3-libstoragemgmt"

inherit rpm
