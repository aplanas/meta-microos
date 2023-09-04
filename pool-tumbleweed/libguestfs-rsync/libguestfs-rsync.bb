SUMMARY = "Rsync support for libguestfs"
DESCRIPTION = "This adds rsync support to libguestfs.  Install it if you want to use \
rsync to upload or download files into disk images."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfs-rsync-1.50.1-4.2.aarch64.rpm"
RPM_HASH = "b84191df606bd878d43dabbfea127b224942a304f56572da687fc6e9e600a38e7fb63296ba157b26b95d4fa2c75a5e2b900355483459840a864f2a3cb6d766d8"

RPROVIDES:${PN} += "libguestfs-rsync"

RDEPENDS:${PN} += "libguestfs"

inherit rpm
