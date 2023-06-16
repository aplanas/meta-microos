SUMMARY = "Utility to store, retrieve, generate and synchronize passwords"
DESCRIPTION = "With password-store, each password lives inside of a gpg encrypted file whose \
filename is the title of the website or resource that requires the password. \
These encrypted files may be organized into meaningful folder hierarchies, \
copied from computer to computer, and, in general, manipulated using standard \
command line file management utilities."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.4"

RPM_NAME = "password-store-1.7.4-5.3.noarch.rpm"
RPM_HASH = "885d6e3386aa0895a54135266f145f63f9c92f6f758c81e4b0494788371f584cbe577efc3e10955cb35bd2849113d7a1bb2f64aeb98225fd252715309dc12cbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "password-store"

RDEPENDS:${PN} += "/usr/bin/bash \
gpg2 \
qrencode \
tree"

inherit rpm
