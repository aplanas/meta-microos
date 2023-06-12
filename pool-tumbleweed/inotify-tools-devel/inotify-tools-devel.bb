SUMMARY = "Development files for inotify-tools"
DESCRIPTION = "This package contains the development files for inotify-tools, which provides \
utilities for the kernel facility inotify."
LICENSE = "GPL-2.0-only-WITH-Linux-syscall-note & GPL-2.0-or-later"

PV = "3.22.6.0"

RPM_NAME = "inotify-tools-devel-3.22.6.0-1.4.aarch64.rpm"
RPM_HASH = "f0c951a97137ab8800e9c09c37cb2643c53a63d964774460666516bd38465778429fdcc5e818f11fac073110c0dc84e35133d03a868aee9a788c6f9738a98aef"

RPROVIDES:${PN} += "inotify-tools-devel \
inotify-tools-devel(aarch-64)"
RDEPENDS:${PN} += "libinotifytools0"

inherit rpm
