SUMMARY = "Flexible modular implementation of DICT server (RFC 2229)"
DESCRIPTION = "GNU Dico is a flexible modular implementation of DICT server (RFC 2229). In \
contrast to another implementations, it does not depend on particular \
database format. GNU Dico handles database accesses using loadable modules."
LICENSE = "GPL-3.0-or-later"

PV = "2.11"

RPM_NAME = "dico-2.11-1.16.aarch64.rpm"
RPM_HASH = "71a4058b30b53df3db24cdd6d63c7445cbdc64f0edcd1627986289b1676aaaeafc639cee3f72903797d15d690ac7e313d44c25492614b8b7436669066d68c6ae"

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
