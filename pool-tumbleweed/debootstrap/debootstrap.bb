SUMMARY = "Bootstrap a basic Debian system"
DESCRIPTION = "debootstrap is used to create a Debian base system from scratch, \
without requiring the availability of dpkg or apt. It does this \
by downloading .deb files from a mirror site, and carefully \
unpacking them into a directory which can eventually be chrooted \
into."
LICENSE = "MIT"

PV = "1.0.128"

RPM_NAME = "debootstrap-1.0.128-2.1.noarch.rpm"
RPM_HASH = "c782f170b11635c4eb75be335c153c0e3e2d7abbc18ed11163437f23aa7e9aff43d97882a07e1eac05e4ee57fc47c958ae0803fdc3c2e267e10ce760b98d782d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "debootstrap"

RDEPENDS:${PN} += "/usr/bin/sh \
binutils \
wget"

inherit rpm
