SUMMARY = "Utilities for Manipulating Desktop Files"
DESCRIPTION = "This packages contains a couple of command line utilities for \
working with desktop files. \
 \
More information about desktop files can be found at: \
http://freedesktop.org/wiki/Specifications/desktop-entry-spec"
LICENSE = "GPL-2.0-or-later"

PV = "0.26"

RPM_NAME = "desktop-file-utils-0.26-6.1.aarch64.rpm"
RPM_HASH = "ae57c483beadb47c20bcb511244a1f08884977fa6afb7044dd0446a60f152559bb92078b68567750337da7f078e94b31d4e31a576637651caea3df18fa1db712"

RPROVIDES:${PN} += "desktop-file-utils \
desktop-file-utils(aarch-64) \
rpm_macro(desktop_database_post) \
rpm_macro(desktop_database_postun)"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
awk \
coreutils \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libglib-2.0.so.0()(64bit)"

inherit rpm
