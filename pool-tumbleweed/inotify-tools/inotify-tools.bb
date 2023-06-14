SUMMARY = "Tools for inotify"
DESCRIPTION = "inotify is a kernel facility to watch file system changes. This \
package provides some tools for it."
LICENSE = "GPL-2.0-only-WITH-Linux-syscall-note & GPL-2.0-or-later"

PV = "3.22.6.0"

RPM_NAME = "inotify-tools-3.22.6.0-1.4.aarch64.rpm"
RPM_HASH = "0658ec9f29490c92df925d8578c111543f3ebd53971d7c091636d447bcfcd63f0dd2f8545d8e9871976e01cf56f6319c5797ecd1a9a086150b1e4aaeea991229"

RPROVIDES:${PN} += "inotify-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libinotifytools.so.0"

inherit rpm
