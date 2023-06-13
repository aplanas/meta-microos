SUMMARY = "Several tools for reading the File Vault Drive Encryption format"
DESCRIPTION = "Several tools for reading the File Vault Drive Encryption format \
 \
See libfvde for additional details."
LICENSE = "LGPL-3.0-or-later"

PV = "20220915"

RPM_NAME = "libfvde-tools-20220915-3.11.aarch64.rpm"
RPM_HASH = "3988a88752b3085ba9b1b258256859690f99c8955f476660e48cce2f53f8245c1dbc82d16f93af6b59d47f0f2e6651efb4bda8a4978d19ba526ef11bc20e38f7"

RPROVIDES:${PN} += "libfvde-tools \
libfvde-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6()(64bit) \
libcdata.so.1()(64bit) \
libcdata.so.1(V_20230108)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libclocale.so.1()(64bit) \
libclocale.so.1(V_20221218)(64bit) \
libcnotify.so.1()(64bit) \
libcnotify.so.1(V_20220108)(64bit) \
libfguid.so.1()(64bit) \
libfguid.so.1(V_20220113)(64bit) \
libfuse.so.2()(64bit) \
libfvde.so.1()(64bit) \
libfvde.so.1(V_20220915)(64bit) \
libfvde1 \
libuna.so.1()(64bit) \
libuna.so.1(V_20220611)(64bit)"

inherit rpm
