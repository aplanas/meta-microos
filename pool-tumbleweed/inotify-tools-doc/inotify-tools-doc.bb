SUMMARY = "Documentation for inotify-tools"
DESCRIPTION = "This package contains the documentation for inotify-tools, which provides \
utilities for the kernel facility inotify."
LICENSE = "GPL-2.0-only-with-Linux-syscall-note & GPL-2.0-or-later"

PV = "3.22.6.0"

RPM_NAME = "inotify-tools-doc-3.22.6.0-1.4.noarch.rpm"
RPM_HASH = "692c24e7c45a9ef2f9de6ba41f58205c383169803137a1e836bdbc7822aa9bf2e117fc51ac80f67568d29c169b5e3cd86ddfc296f0af5b5f99d073edd4254b1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "inotify-tools-doc"

RDEPENDS:${PN} += "inotify-tools"

inherit rpm
