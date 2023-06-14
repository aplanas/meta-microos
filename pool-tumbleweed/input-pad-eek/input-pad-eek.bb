SUMMARY = "Input Pad with eekboard extension"
DESCRIPTION = "The input-pad-eek package contains eekboard extension module"
LICENSE = "LGPL-2.0-or-later"

PV = "1.0.99.20140916"

RPM_NAME = "input-pad-eek-1.0.99.20140916-5.9.aarch64.rpm"
RPM_HASH = "10b36350bbe863a73b09493da462d734e1b68ea5a191e6e02a18fe8e186ddb2e2a70bd52ce87431f176cf13283622bd2cf6102370231369bb98331b9e80e5b20"

RPROVIDES:${PN} += "input-pad-eek \
libinput-pad-eek-gtk.so"

RDEPENDS:${PN} += "input-pad \
ld-linux-aarch64.so.1 \
libc.so.6 \
libeek-gtk.so.0 \
libeek-xkl.so.0 \
libeek.so.0 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libinput-pad-1.0.so.1"

inherit rpm
