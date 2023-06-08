SUMMARY = "SpamAssassin plugin for the Evolution groupware suite"
DESCRIPTION = "Adds support for junk-mail filtering via spamassassin."
LICENSE = "CC-BY-SA-3.0 & LGPL-2.0-only & LGPL-3.0-only & OLDAP-2.8 & GFDL-1.1-only & GFDL-1.3-only"

PV = "3.48.1"

RPM_NAME = "evolution-plugin-spamassassin-3.48.1-1.1.aarch64.rpm"
RPM_HASH = "3d73b3dc434b9e0d6d3d9baf70d12ccccfa799e9b558ac75fd05b1574ef6fe5645c2bed73797dfb9ba661bb0ae1731ab86968a55dc6ff6fda4c26741fc1f9895"

RPROVIDES:${PN} += "evolution-plugin-spamassassin evolution-plugin-spamassassin(aarch-64) metainfo() metainfo(org.gnome.Evolution-spamassassin.metainfo.xml)"
RDEPENDS:${PN} += "evolution ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcamel-1.2.so.64()(64bit) libedataserver-1.2.so.27()(64bit) libemail-engine.so()(64bit) libevolution-util.so()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) spamassassin"

inherit rpm
