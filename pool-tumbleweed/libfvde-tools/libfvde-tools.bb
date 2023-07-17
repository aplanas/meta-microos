SUMMARY = "Several tools for reading the File Vault Drive Encryption format"
DESCRIPTION = "Several tools for reading the File Vault Drive Encryption format \
 \
See libfvde for additional details."
LICENSE = "LGPL-3.0-or-later"

PV = "20220915"

RPM_NAME = "libfvde-tools-20220915-3.15.aarch64.rpm"
RPM_HASH = "f4761fdfbd889e68d44b9edb3eebc0d93c49b104484e5ecc26f1cdd5cf12707b2e7a3031525bdd2f1ece6f340676a69787c136191a37ccdb28e506f8ba76321c"

RPROVIDES:${PN} += "libfvde-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfguid.so.1 \
libfuse.so.2 \
libfvde.so.1 \
libfvde1 \
libuna.so.1"

inherit rpm
