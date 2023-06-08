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

RPM_NAME = "duplicity-1.2.2-1.2.aarch64.rpm"
RPM_HASH = "234a159ea84ada7752df8662562e5ddb5cda41847fc72c436e8371a346197f95cca2e077674a327cdc497f6212e6cc2aa353cf371010f757278fd259f50dc0ce"

RPROVIDES:${PN} += "duplicity duplicity(aarch-64) python3.10dist(duplicity) python3dist(duplicity)"
RDEPENDS:${PN} += "/usr/bin/python3 gpg ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) librsync.so.2()(64bit) python(abi) python3-fasteners python3-future python3-lockfile"

inherit rpm
