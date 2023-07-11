SUMMARY = "RPM repository metadata generation utility"
DESCRIPTION = "C implementation of Createrepo. \
A set of utilities (createrepo_c, mergerepo_c, modifyrepo_c) \
for generating a common metadata repository from a directory of \
rpm packages and maintaining it."
LICENSE = "GPL-2.0-or-later"

PV = "0.20.1"

RPM_NAME = "createrepo_c-0.20.1-3.2.aarch64.rpm"
RPM_HASH = "6cc0bfb52632491a1716eb491653d07798f6d2ca63ae64dbc970b1b2f775810705f5a2a173d0c3694218cae3c472ba7713ac47864216f9f32eeb0f04c313fdb1"

RPROVIDES:${PN} += "createrepo \
createrepo-c \
createrepo-implementation"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcreaterepo-c.so.0 \
libcreaterepo-c0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libmodulemd.so.2 \
update-alternatives"

inherit rpm
