SUMMARY = "Development files for inotify-tools"
DESCRIPTION = "This package contains the development files for inotify-tools, which provides \
utilities for the kernel facility inotify."
LICENSE = "GPL-2.0-only-with-Linux-syscall-note & GPL-2.0-or-later"

PV = "3.22.6.0"

RPM_NAME = "inotify-tools-devel-3.22.6.0-1.5.aarch64.rpm"
RPM_HASH = "d6e8292a022c29ef9df94748bf8184190b8cc796b8597ac169e2b45bd51a6f01d31d9493b2767d42f880c8e8bf9f7c39c15ec1e434e042c3225a2095d6302cfc"

RPROVIDES:${PN} += "inotify-tools-devel"

RDEPENDS:${PN} += "libinotifytools0"

inherit rpm
