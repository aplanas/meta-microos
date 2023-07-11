SUMMARY = "Documentation for inotify-tools"
DESCRIPTION = "This package contains the documentation for inotify-tools, which provides \
utilities for the kernel facility inotify."
LICENSE = "GPL-2.0-only-with-Linux-syscall-note & GPL-2.0-or-later"

PV = "3.22.6.0"

RPM_NAME = "inotify-tools-doc-3.22.6.0-1.5.noarch.rpm"
RPM_HASH = "5e09c0027f258e47b549e6ebf2f9558a6df0a92c11297783701b84585bc90f97010ab0fa879c00779869e78356285c5ee4eb8551e596b156896e8d4cc5e948e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "inotify-tools-doc"

RDEPENDS:${PN} += "inotify-tools"

inherit rpm
