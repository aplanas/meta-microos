SUMMARY = "Several tools for reading the File Vault Drive Encryption format"
DESCRIPTION = "Several tools for reading the File Vault Drive Encryption format \
 \
See libfvde for additional details."
LICENSE = "LGPL-3.0-or-later"

PV = "20220915"

RPM_NAME = "libfvde-tools-20220915-3.11.aarch64.rpm"
RPM_HASH = "3988a88752b3085ba9b1b258256859690f99c8955f476660e48cce2f53f8245c1dbc82d16f93af6b59d47f0f2e6651efb4bda8a4978d19ba526ef11bc20e38f7"

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
