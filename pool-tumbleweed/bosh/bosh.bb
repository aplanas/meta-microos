SUMMARY = "Multibyte-capable POSIX-conforming Bourne shell"
DESCRIPTION = "bosh is a Bourne-style POSIX command interpreter (shell), similar to dash, \
but supports multibyte input/output."
LICENSE = "CDDL-1.0"

PV = "2022.10.16"

RPM_NAME = "bosh-2022.10.16-47.4.aarch64.rpm"
RPM_HASH = "c17ee68523cbefe94f62e0d8c5a11efa181593d5682396c93f901f226b9e8da6f3dd227cacb4e75ac56ba835339c613073e2101987f71f4e0a5cfd45dcb95728"

RPROVIDES:${PN} += "bosh"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libfind.so.4.0 \
libschily.so.2.0 \
libxtermcap.so.1.0"

inherit rpm
