SUMMARY = "Daemon for PGP prompting by libcryptui"
DESCRIPTION = "Libcryptui is a library used for prompting for PGP keys."
LICENSE = "GPL-2.0-or-later"

PV = "3.12.2"

RPM_NAME = "seahorse-daemon-3.12.2-10.4.aarch64.rpm"
RPM_HASH = "ed8ccc240667d76b4619bc4a690854fe21cb2592bdeaa59e12e6e423359c0c7bc6be8e520e5fd05e538a93d0a72a712964e836e7e32323ade70ee621c716bdcf"

RPROVIDES:${PN} += "seahorse-daemon"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcryptui-data \
libcryptui.so.0 \
libdbus-1.so.3 \
libdbus-glib-1.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-keyring.so.0 \
libgobject-2.0.so.0 \
libgpgme.so.11 \
libgtk-3.so.0 \
libnotify.so.4"

inherit rpm
