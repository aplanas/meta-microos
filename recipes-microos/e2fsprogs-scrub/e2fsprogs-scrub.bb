SUMMARY = "Ext2fs scrubbing scripts and service files"
DESCRIPTION = "Scripts and systemd service files for background scrubbing of LVM volumes \
with ext2, ext3, and ext4 filesystems."
LICENSE = "GPL-2.0-only"

PV = "1.46.5"

RPM_NAME = "e2fsprogs-scrub-1.46.5-4.3.aarch64.rpm"
RPM_HASH = "a6c7cd8c95cb3f6948e91e1e6ef87b44534c94e3fa9688e21b595e8756374ab0462b8e09075ad420bfa1c418c0fa54bf215c38e59efb68279f931c1a6b435589"

RPROVIDES:${PN} += "config(e2fsprogs-scrub) e2fsprogs-scrub e2fsprogs-scrub(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh e2fsprogs lvm2 postfix systemd util-linux"

inherit rpm
