SUMMARY = "POSIX Manual Pages"
DESCRIPTION = "A large collection of man pages (reference material) from \
 \
This release contains a copy of the POSIX 1003.1-2017 man pages. \
The directories man0p, man1p, man3p contain descriptions of the \
headers, the utilities, and the functions documented in that standard. \
For the copyright notice, see the file POSIX-COPYRIGHT. \
 \
The man pages are organized into the following sections: \
* 0p: POSIX headers \
* 1p: POSIX utilities \
* 3p: POSIX functions"
LICENSE = "SUSE-IEEE"

PV = "2017a"

RPM_NAME = "man-pages-posix-2017a-1.8.noarch.rpm"
RPM_HASH = "67b28f58f1ecdc01b91f1a71ac8a6351031629e99cfe44acb8d66a4beb0eee02664a970f91fa0e9991c6318c6165fcec9fc90b9cb2bbb0ad1c6ae0689fbbb2a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-pages-posix"

RDEPENDS:${PN} += ""

inherit rpm
