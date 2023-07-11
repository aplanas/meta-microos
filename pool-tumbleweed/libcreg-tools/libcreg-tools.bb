SUMMARY = "Utilities to inspect Windows 9x/Me REGF-type Registry files"
DESCRIPTION = "Several tools for inspecting Windows 9x/Me REGF-type Registry files. \
Typically used for computer forensics."
LICENSE = "LGPL-3.0-or-later"

PV = "20210625"

RPM_NAME = "libcreg-tools-20210625-5.9.aarch64.rpm"
RPM_HASH = "79c6766d4ccae2441aeb0636beedb04c639ed851b4a8dce48aba3572b717feccfa146a55686db833aab9374d7c0e09d1cdbec2e3b849c1ba26ed8679f703cb66"

RPROVIDES:${PN} += "libcreg-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcreg.so.1 \
libfuse.so.2 \
libuna.so.1"

inherit rpm
