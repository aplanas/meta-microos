SUMMARY = "Userspace utilities for fs-verity"
DESCRIPTION = "fsverity is a userspace utility for fs-verity. fs-verity is a Linux \
kernel filesystem feature that does transparent on-demand verification \
of the contents of read-only files using Merkle trees. \
 \
fsverity can enable fs-verity on files, retrieve the digests of \
fs-verity files, and sign files for use with fs-verity (among other \
things). fsverity's functionality is divided among various subcommands."
LICENSE = "MIT"

PV = "1.5"

RPM_NAME = "fsverity-utils-1.5-1.1.aarch64.rpm"
RPM_HASH = "5376d7910b3d3730f51035e9650a5cdedf36f846b4e1c50113650fbc5cc81c2651b704c398a5a706b40ac336e34b91fb7c117a7cd157c01b188256edea386957"

RPROVIDES:${PN} += "fsverity-utils"

RDEPENDS:${PN} += "libc.so.6 \
libfsverity.so.0"

inherit rpm
