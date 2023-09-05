SUMMARY = "A graphical user interface library"
DESCRIPTION = "girara is a library that implements a user interface that focuses on \
simplicity and minimalism. Currently based on GTK+, \
it provides an interface that focuses on three main \
components: A so-called view widget that represents the actual \
application (e.g. a website (browser), an image (image viewer) or the \
document (document viewer)), an input bar that is used to execute \
commands of the application and the status bar which provides the user \
with current information. girara was designed to replace and enhance \
the user interface that is used by zathura and jumanji and other \
features that those applications share."
LICENSE = "Zlib"

PV = "0.4.0"

RPM_NAME = "libgirara-gtk3-3-0.4.0-1.1.aarch64.rpm"
RPM_HASH = "0c9c461d914ce994e7392ffe994f18095c15b56150a74522253b8ec1371b96535e0e8f7e53e30be9ca20b9604f36f3218a5009eb91527b1af866867c972198c1"

RPROVIDES:${PN} += "libgirara-gtk3-3 \
libgirara-gtk3.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libjson-glib-1.0.so.0 \
libpango-1.0.so.0"

inherit rpm
