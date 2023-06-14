SUMMARY = "Utilities to inspect Windows REGF-type Registry files"
DESCRIPTION = "Several tools for inspecting Windows REGF-type Registry files. \
Typically used for computer forensics."
LICENSE = "LGPL-3.0-or-later"

PV = "20230319"

RPM_NAME = "libregf-tools-20230319-1.2.aarch64.rpm"
RPM_HASH = "320e537f6b52755e08bd285685264a729e155bb3c0f452e8683044055316bd8acef2b93e332e905f7867f1e98ce0d6c9d8d2eb7df56898628477c7be16d50b21"

RPROVIDES:${PN} += "libregf-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfdatetime.so.1 \
libfuse.so.2 \
libregf.so.1 \
libuna.so.1"

inherit rpm
