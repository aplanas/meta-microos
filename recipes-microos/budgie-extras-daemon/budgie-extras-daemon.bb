SUMMARY = "Daemon for Budgie Extras"
DESCRIPTION = "This on logon process manages keyboard shortcuts delivered via .bde files for various extras-plugins."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-extras-daemon-1.6.0-1.1.aarch64.rpm"
RPM_HASH = "29b8f38b8014559f375d001ab541fc8221fd22e526633cd2e040ccf415215d23269bfca5138369cc65903460e8a2ac10469e54023eb84e56a81c367d133eb677"

RPROVIDES:${PN} += "budgie-extras-daemon budgie-extras-daemon(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libkeybinder-3.0.so.0()(64bit)"

inherit rpm
