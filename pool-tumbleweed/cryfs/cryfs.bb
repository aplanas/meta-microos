SUMMARY = "Cryptographic filesystem for the cloud"
DESCRIPTION = "CryFS provides a FUSE-based mount that encrypts file contents, file \
sizes, metadata and directory structure. It uses encrypted same-size \
blocks to store both the files themselves and the blocks' relations \
to one another. These blocks are stored as individual files in the \
base directory, which can then be synchronized to remote storage \
(using an external tool)."
LICENSE = "LGPL-3.0-only"

PV = "0.11.3"

RPM_NAME = "cryfs-0.11.3-2.4.aarch64.rpm"
RPM_HASH = "eabda62114e9ad27dabd14ee25419efb3b3737c326b3df5a8cd97e8154ec7f4222829b187469de1a6a3a23f5db0844e54d8512f7029f269628a40ec4704e399a"

RPROVIDES:${PN} += "cryfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libboost-chrono.so.1.82.0 \
libboost-filesystem.so.1.82.0 \
libboost-program-options.so.1.82.0 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libcurl.so.4 \
libfmt.so.9 \
libfuse.so.2 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libspdlog.so.1.12 \
libstdc++.so.6"

inherit rpm
