SUMMARY = "RPM repository metadata generation utility"
DESCRIPTION = "C implementation of Createrepo. \
A set of utilities (createrepo_c, mergerepo_c, modifyrepo_c) \
for generating a common metadata repository from a directory of \
rpm packages and maintaining it."
LICENSE = "GPL-2.0-or-later"

PV = "0.20.1"

RPM_NAME = "createrepo_c-0.20.1-3.1.aarch64.rpm"
RPM_HASH = "83b8ce010e3eff252fade5380c16a3b891db10e40a4ef1c66ae5a7cfc0a95667a44ca36ab006941add7884cc9f959d6de3f9562f7a6c8b0f37b64d9cf9da85f1"

RPROVIDES:${PN} += "createrepo createrepo-implementation createrepo_c createrepo_c(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcreaterepo_c.so.0()(64bit) libcreaterepo_c0 libcreaterepo_c0(aarch-64) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libmodulemd.so.2()(64bit) update-alternatives"

inherit rpm
