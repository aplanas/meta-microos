SUMMARY = "Threaded Newsreader"
DESCRIPTION = "slrn is a threaded Internet newsreader. It is customizable, \
permitting redefinition of keys and it includes a sophisticated macro \
language for further customization."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.3"

RPM_NAME = "slrn-1.0.3-3.19.aarch64.rpm"
RPM_HASH = "38b7dd18f45ca6f97d678b27eec251a9d7698e019aa958d41daeaf903765bed95fbdadadaeb7685aac5dd39bff32cb1d29c697f820dd5c3553948bf74da2badb"

RPROVIDES:${PN} += "config-slrn \
slrn"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libslang.so.2 \
libssl.so.3"

inherit rpm
