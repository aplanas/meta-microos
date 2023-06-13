SUMMARY = "Thunar Plugin Providing VCS Integration"
DESCRIPTION = "The Thunar VCS Plugin provides integration with Subversion and GIT VCS and \
makes VCS actions available through the context menu."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.0"

RPM_NAME = "thunar-plugin-vcs-0.2.0-1.23.aarch64.rpm"
RPM_HASH = "fc6786619908b658c785fc06217235184a84c370d07992644b6871f340bf37af67cca820159c49e5cbe90151fa260e53faa1a5c4a2c3cdf85d038a26643422c9"

RPROVIDES:${PN} += "thunar-plugin-vcs \
thunar-plugin-vcs(aarch-64) \
thunar-vcs-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libapr-1.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libexo-2.so.0()(64bit) \
libgdk-3.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libsvn_client-1.so.0()(64bit) \
libsvn_fs-1.so.0()(64bit) \
libsvn_subr-1.so.0()(64bit) \
libsvn_wc-1.so.0()(64bit) \
libthunarx-3.so.0()(64bit) \
libxfce4util.so.7()(64bit) \
thunar"

inherit rpm
