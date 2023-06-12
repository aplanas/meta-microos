SUMMARY = "Files for Microsemi storage support for libstoragemgmt"
DESCRIPTION = "The libstoragemgmt-arcconf-plugin package contains the plugin for Microsemi \
storage."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.9.8"

RPM_NAME = "libstoragemgmt-arcconf-plugin-1.9.8-1.1.noarch.rpm"
RPM_HASH = "2800514d80bd17a79890ee7d20991ac3cade8ba39bec2f7bbca177c63811bed0cd7b30eef62a4c56820bc52b1e41c017b33ca5f9f4d87a0a3b0bf440ebf68368"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(libstoragemgmt-arcconf-plugin) \
libstoragemgmt-arcconf-plugin"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
python(abi) \
python3-libstoragemgmt"

inherit rpm
