SUMMARY = "Utilities to inspect Common Log File Systems"
DESCRIPTION = "This subpackage provides the utilities from libfsclfs, which allows for \
reading Common Log File Systems (CLFS)."
LICENSE = "LGPL-3.0-or-later"

PV = "20210417"

RPM_NAME = "libfsclfs-tools-20210417-3.5.aarch64.rpm"
RPM_HASH = "036a23dadb12787bdd24ff5bedaea237662fb0f723166f1d21dddb1bebf40c1cbeacf6eee688dda0cb319f9b4b0c416cbf22409b9d372ae75ec59fdd3e43facd"

RPROVIDES:${PN} += "libfsclfs-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfsclfs.so.1 \
libftxf.so.1 \
libftxr.so.1"

inherit rpm
