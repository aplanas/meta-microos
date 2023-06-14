SUMMARY = "Integrate Nautilus and E-Mail clients"
DESCRIPTION = "This package provides the functionality to the Nautilus file browser to \
send files over e-mail via Evolution, Thunderbird, Sylpheed or Balsa."
LICENSE = "GPL-2.0-or-later"

PV = "3.8.6"

RPM_NAME = "nautilus-sendto-3.8.6-6.7.aarch64.rpm"
RPM_HASH = "81057b09fd883eb6d1e09cbf73930f40154148fae659c67852726dbe08ab3a5876dc3116e80197c25a48cb66436fa8763f360bee3762894c6f8a7af14b9a47cc"

RPROVIDES:${PN} += "nautilus-sendto"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
