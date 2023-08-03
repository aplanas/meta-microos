SUMMARY = "Git extension for versioning large files"
DESCRIPTION = "Git Large File Storage (LFS) replaces large files such as audio samples, \
videos, datasets, and graphics with text pointers inside Git, while \
storing the file contents on a remote server."
LICENSE = "MIT"

PV = "3.4.0"

RPM_NAME = "git-lfs-3.4.0-1.1.aarch64.rpm"
RPM_HASH = "919a0880c39ca3195ef4a9634983d5c8d15b009a985118c5949eefa429704c16bfa049fe44e372ff5bab4b53f2bc88112bd9f0e7d0caa83d4f30531683d9d586"

RPROVIDES:${PN} += "git-lfs"

RDEPENDS:${PN} += "/usr/bin/sh \
git-core \
libc.so.6"

inherit rpm
