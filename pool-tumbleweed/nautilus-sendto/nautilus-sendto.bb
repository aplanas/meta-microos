SUMMARY = "Integrate Nautilus and E-Mail clients"
DESCRIPTION = "This package provides the functionality to the Nautilus file browser to \
send files over e-mail via Evolution, Thunderbird, Sylpheed or Balsa."
LICENSE = "GPL-2.0-or-later"

PV = "3.8.6"

RPM_NAME = "nautilus-sendto-3.8.6-6.8.aarch64.rpm"
RPM_HASH = "5fd52cf352a57fbb976ceed6c2ae80de8936703c61019821f0a529c0327579094f6dbfca7160d0999b1f564e241f681442a8e4ea84cd5fe9ad7d5439d37d98a6"

RPROVIDES:${PN} += "nautilus-sendto"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
