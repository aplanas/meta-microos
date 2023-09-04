SUMMARY = "Several tools for reading the File Vault Drive Encryption format"
DESCRIPTION = "Several tools for reading the File Vault Drive Encryption format \
 \
See libfvde for additional details."
LICENSE = "LGPL-3.0-or-later"

PV = "20220915"

RPM_NAME = "libfvde-tools-20220915-4.1.aarch64.rpm"
RPM_HASH = "7f84304b903c6267e0cd93f50c3510f6dbe2b8950c27f798182cb9b58b41a00c3ec409082848bafa7ee8babca2aa93436a68c3b4de5474beaacb2fb2d1813dae"

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
