SUMMARY = "Utilities to handle user data directories"
DESCRIPTION = "xdg-user-dirs is a tool to help manage 'well known' user directories \
like the desktop folder and the music folder. It also \
handles localization (i.e. translation) of the filenames."
LICENSE = "GPL-2.0-only"

PV = "0.18"

RPM_NAME = "xdg-user-dirs-0.18-2.2.aarch64.rpm"
RPM_HASH = "9b5098eb21565f47d0c0945ad05903f713a0ed6ff943bfff61f44bc73cea5b071b03d4b81e5433930860c0baf6cdffab79622b19e81e607a032477449c777567"

RPROVIDES:${PN} += "config-xdg-user-dirs \
xdg-user-dirs"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
