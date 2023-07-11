SUMMARY = "Cryptographic filesystem for the cloud"
DESCRIPTION = "CryFS provides a FUSE-based mount that encrypts file contents, file \
sizes, metadata and directory structure. It uses encrypted same-size \
blocks to store both the files themselves and the blocks' relations \
to one another. These blocks are stored as individual files in the \
base directory, which can then be synchronized to remote storage \
(using an external tool)."
LICENSE = "LGPL-3.0-only"

PV = "0.11.3"

RPM_NAME = "cryfs-0.11.3-2.3.aarch64.rpm"
RPM_HASH = "fb40df99044d582e8fb5ea144cbf490a56db44a0dfaffd90bd8882522d2849c5e460d634927d984c47bbf5eb373d889454037ada3ba0b16a463f01c39a7240d6"

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
