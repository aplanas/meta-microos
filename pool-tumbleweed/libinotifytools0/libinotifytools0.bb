SUMMARY = "Library files for inotify-tools"
DESCRIPTION = "inotify is a kernel facility to watch file system changes. This \
package provides some tools for it."
LICENSE = "GPL-2.0-only-with-Linux-syscall-note & GPL-2.0-or-later"

PV = "3.22.6.0"

RPM_NAME = "libinotifytools0-3.22.6.0-1.5.aarch64.rpm"
RPM_HASH = "18e44741f7e6aafdae28e6aec261818cb90ea4fefa210d7cb874ffc4b45b9da176a5a8f8fd390a938df2988f4c217486500fe4c765ce92756ae717d82ddb9870"

RPROVIDES:${PN} += "libinotifytools.so.0 \
libinotifytools0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
