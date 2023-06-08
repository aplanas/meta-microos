SUMMARY = "Bootstrap a basic Debian system"
DESCRIPTION = "debootstrap is used to create a Debian base system from scratch, \
without requiring the availability of dpkg or apt. It does this \
by downloading .deb files from a mirror site, and carefully \
unpacking them into a directory which can eventually be chrooted \
into."
LICENSE = "MIT"

PV = "1.0.128"

RPM_NAME = "debootstrap-1.0.128-1.2.noarch.rpm"
RPM_HASH = "1ce01c0aa27440693fda5e3ed5d74af1a149274f9f20b848c04b39028e212fb40b3c00a76b11412e02f6fb2f1b568d9dc8b92e7837cb4ddd97cf8036f7c2b7e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "debootstrap"
RDEPENDS:${PN} += "/bin/sh wget"

inherit rpm
