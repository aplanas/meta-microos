SUMMARY = "Userspace Unionfs File System"
DESCRIPTION = "unionfs-fuse overlays several directory into one single mount point \
 \
It  first  tries to access the file on the top branch and if the file \
does not exist there, it continues on lower level branches. If the user \
tries to modify a file on a lower level read-only branch the file is \
copied to to a higher level read-write branch if the copy-on-write \
(cow) mode was enabled."
LICENSE = "BSD-3-Clause"

PV = "2.1"

RPM_NAME = "unionfs-fuse-2.1-1.8.aarch64.rpm"
RPM_HASH = "9343f974581c132d176cb1ee7af334feb0f850de458227b45e5828c6fbf27609b44cb6af093ab0d48498852c1e4fac969ccd82ed5c39e75fea11ca945ca67e25"

RPROVIDES:${PN} += "unionfs-fuse \
unionfs-fuse(aarch-64)"
RDEPENDS:${PN} += "fuse \
libc.so.6(GLIBC_2.34)(64bit) \
libfuse.so.2()(64bit) \
libfuse.so.2(FUSE_2.5)(64bit) \
libfuse.so.2(FUSE_2.6)(64bit) \
libfuse.so.2(FUSE_2.8)(64bit)"

inherit rpm
