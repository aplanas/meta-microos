SUMMARY = "Git extension for versioning large files"
DESCRIPTION = "Git Large File Storage (LFS) replaces large files such as audio samples, \
videos, datasets, and graphics with text pointers inside Git, while \
storing the file contents on a remote server."
LICENSE = "MIT"

PV = "3.3.0"

RPM_NAME = "git-lfs-3.3.0-1.6.aarch64.rpm"
RPM_HASH = "c0aa0609a19d3eaebb0d1841adf1c333685570d7ac2c8d7db96d20bcf56f8d2fd9ec7c4edbbb04a4fabdf7cb5227bc6b4c115db33c1855ed5539f51d1f3edd5b"

RPROVIDES:${PN} += "git-lfs"

RDEPENDS:${PN} += "/usr/bin/sh \
git-core \
libc.so.6"

inherit rpm
