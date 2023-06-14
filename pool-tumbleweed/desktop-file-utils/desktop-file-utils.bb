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
rpm-macro-desktop-database-post \
rpm-macro-desktop-database-postun"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
awk \
coreutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0"

inherit rpm
