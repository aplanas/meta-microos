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

PV = "1.2.3"

RPM_NAME = "duplicity-1.2.3-1.1.aarch64.rpm"
RPM_HASH = "03437de526a0fe5f979d81526497ffe9418b3da77a1febd9b77ecccd077bbb08e04e34ea241eb420b25f8593945b08b1f718492f9d865df6f2721ca4bc88434b"

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
