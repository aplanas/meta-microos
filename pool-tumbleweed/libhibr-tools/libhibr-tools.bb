SUMMARY = "Utilities to inspect Windows Hibernation Files"
DESCRIPTION = "This subpackage provides the utilities from libhibr, which allows for \
inspecting Windows Hibernation Files (hiberfil.sys)."
LICENSE = "LGPL-3.0-or-later"

PV = "20210421"

RPM_NAME = "libhibr-tools-20210421-3.6.aarch64.rpm"
RPM_HASH = "ff24ea2aa32f213dc2d3a3bc663c4385b92f8ffd1cdb2796e9117e8dcdf455471684f30389a1efa057760aefeda6dac6f9e1d30dc30b099744a3f5a5b0884155"

RPROVIDES:${PN} += "libhibr-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfuse.so.2 \
libhibr.so.1"

inherit rpm
