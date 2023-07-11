SUMMARY = "Rsync support for libguestfs"
DESCRIPTION = "This adds rsync support to libguestfs.  Install it if you want to use \
rsync to upload or download files into disk images."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfs-rsync-1.50.1-3.3.aarch64.rpm"
RPM_HASH = "fcab34588d971cfd96c559cc380d10c4441ca8b53a0493c443cd4994e797964c2d85228844591d645bdf6475fbf964536b0118800072088b97453b27dee52186"

RPROVIDES:${PN} += "libguestfs-rsync"

RDEPENDS:${PN} += "libguestfs"

inherit rpm
