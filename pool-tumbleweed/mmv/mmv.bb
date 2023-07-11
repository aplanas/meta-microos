SUMMARY = "Move/Copy/Append/Link Multiple Files by Wildcard Patterns"
DESCRIPTION = "Mmv moves (or copies, appends, or links, as specified) each source file matching \
a from pattern to the target name specified by the to pattern.  This multiple \
action is performed safely, i.e. without any unexpected deletion of files due to \
collisions of target names with existing filenames or with other target names. \
Furthermore, before doing anything, mmv attempts to detect any errors that would \
result from the entire set of actions specified and gives the user the choice of \
either proceeding by avoiding the offending parts or aborting."
LICENSE = "GPL-1.0-or-later"

PV = "2.4"

RPM_NAME = "mmv-2.4-1.1.aarch64.rpm"
RPM_HASH = "0ed2ece0929d90b73de3b4a1f382a11595a7967ff5c99e80aac8696db2fa35eb749e86b73336597260a367efab5e31fbcd545bd2daccf576682575e3f6c9cfe0"

RPROVIDES:${PN} += "mmv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgc.so.1"

inherit rpm
