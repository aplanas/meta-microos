SUMMARY = "Bogofilter plugin for the Evolution groupware suite"
DESCRIPTION = "Adds support for junk-mail filtering via bogofilter."
LICENSE = "CC-BY-SA-3.0 & LGPL-2.0-only & LGPL-3.0-only & OLDAP-2.8 & GFDL-1.1-only & GFDL-1.3-only"

PV = "3.48.1"

RPM_NAME = "evolution-plugin-bogofilter-3.48.1-1.1.aarch64.rpm"
RPM_HASH = "88198dc3b1d06748539aa88608b8882f6406b01ed99b4680767621d72c3eb8d1d2ed05d50f96c362542bd69ccc390586ff2fd1f709e812936b7c0ae688a1d3a4"

RPROVIDES:${PN} += "evolution-plugin-bogofilter evolution-plugin-bogofilter(aarch-64) metainfo() metainfo(org.gnome.Evolution-bogofilter.metainfo.xml)"
RDEPENDS:${PN} += "bogofilter evolution ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcamel-1.2.so.64()(64bit) libedataserver-1.2.so.27()(64bit) libemail-engine.so()(64bit) libevolution-util.so()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit)"

inherit rpm
