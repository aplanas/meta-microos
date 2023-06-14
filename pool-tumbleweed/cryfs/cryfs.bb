SUMMARY = "Cryptographic filesystem for the cloud"
DESCRIPTION = "CryFS provides a FUSE-based mount that encrypts file contents, file \
sizes, metadata and directory structure. It uses encrypted same-size \
blocks to store both the files themselves and the blocks' relations \
to one another. These blocks are stored as individual files in the \
base directory, which can then be synchronized to remote storage \
(using an external tool)."
LICENSE = "LGPL-3.0-only"

PV = "0.11.3"

RPM_NAME = "cryfs-0.11.3-2.2.aarch64.rpm"
RPM_HASH = "bf776b2a9979e66363de1b1425ab1ed76448c5975d5d3a353a3a0b8663d4c8085db316bdf586a7392a91657637f367a57b68a4ddefc86b281fa2bd235c790e31"

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
libspdlog.so.1.11 \
libstdc++.so.6"

inherit rpm
