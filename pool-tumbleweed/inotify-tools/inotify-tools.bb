SUMMARY = "Tools for inotify"
DESCRIPTION = "inotify is a kernel facility to watch file system changes. This \
package provides some tools for it."
LICENSE = "GPL-2.0-only-with-Linux-syscall-note & GPL-2.0-or-later"

PV = "3.22.6.0"

RPM_NAME = "inotify-tools-3.22.6.0-1.5.aarch64.rpm"
RPM_HASH = "feefec4094f8782aac7f91dc8ff575d9ee28cf7abf0acd2ceaeb83b9601adc4af47e0dfededf45198c40c0fd50d3e84896fe21818cac7573939f2d95481ddaed"

RPROVIDES:${PN} += "inotify-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libinotifytools.so.0"

inherit rpm
