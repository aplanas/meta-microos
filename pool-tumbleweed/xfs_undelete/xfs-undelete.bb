SUMMARY = "An undelete tool for the XFS filesystem"
DESCRIPTION = "xfs_undelete tries to recover all files on an XFS filesystem marked as \
deleted. You may also specify a date or age since deletion, and file types \
to ignore or to recover exclusively."
LICENSE = "GPL-3.0-only"

PV = "12.0"

RPM_NAME = "xfs_undelete-12.0-1.2.noarch.rpm"
RPM_HASH = "41b83d1af953a9ef80d9827a3b43fdf0fe53045a2746891345793cacb2be7230c686d3c74db9a235d31657255bba7878697eeedb9f29822be7c7f11e13501e24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xfs_undelete"

RDEPENDS:${PN} += "/usr/bin/tclsh \
coreutils \
file \
file-magic \
tcl \
tcllib"

inherit rpm
