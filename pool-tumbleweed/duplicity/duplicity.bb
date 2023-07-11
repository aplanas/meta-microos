SUMMARY = "Encrypted bandwidth-efficient backup using the rsync algorithm"
DESCRIPTION = "Duplicity incrementally backs up files and directories by encrypting \
tar-format volumes with GnuPG and uploading them to a remote (or local) \
file server. In theory many remote backends are possible; right now \
local, ssh/scp, ftp, rsync, HSI, WebDAV, and Amazon S3 backends are \
written. \
 \
Because duplicity uses librsync, the incremental archives are space \
efficient and only record the parts of files that have changed since \
the last backup. Currently duplicity supports deleted files, full unix \
permissions, directories, symbolic links, fifos, etc., but not hard \
links."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.2"

RPM_NAME = "duplicity-1.2.2-1.3.aarch64.rpm"
RPM_HASH = "53eee56ee6f4a84cd653e064212f9ee6fabb92c837d83ae39f02e65b27b17b6f8f4e9be91a3ce89dc9d2723c60449f6b3ace01e2ad95bfb7a20f92f5c8152073"

RPROVIDES:${PN} += "duplicity \
python3.11dist-duplicity \
python3dist-duplicity"

RDEPENDS:${PN} += "/usr/bin/python3 \
gpg \
ld-linux-aarch64.so.1 \
libc.so.6 \
librsync.so.2 \
python-abi \
python3-fasteners \
python3-future \
python3-lockfile"

inherit rpm
