SUMMARY = "Flexible modular implementation of DICT server (RFC 2229)"
DESCRIPTION = "GNU Dico is a flexible modular implementation of DICT server (RFC 2229). In \
contrast to another implementations, it does not depend on particular \
database format. GNU Dico handles database accesses using loadable modules."
LICENSE = "GPL-3.0-or-later"

PV = "2.11"

RPM_NAME = "dico-2.11-1.15.aarch64.rpm"
RPM_HASH = "596f306ec9857ba7566ed0824bdfd67cb6d2ed1a05709bfa91ba8fd9167b165f3cf83e3211a178527571b395120edba46299077ad18a79d51544c89724d7f69a"

RPROVIDES:${PN} += "dico"

RDEPENDS:${PN} += "/usr/bin/sh \
info \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libdico.so.2 \
libgsasl.so.7 \
libltdl.so.7 \
libreadline.so.8 \
m4"

inherit rpm
