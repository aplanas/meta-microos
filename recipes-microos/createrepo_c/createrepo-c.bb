SUMMARY = "RPM repository metadata generation utility"
DESCRIPTION = "C implementation of Createrepo. \
A set of utilities (createrepo_c, mergerepo_c, modifyrepo_c) \
for generating a common metadata repository from a directory of \
rpm packages and maintaining it."
LICENSE = "GPL-2.0-or-later"

PV = "0.20.1"

RPM_NAME = "createrepo_c-0.20.1-2.3.aarch64.rpm"
RPM_HASH = "8cfa2eb5a4c6f1404febfedf2070e624736dcd35d73df5140f833d204a7e22e92b49af33616b36df1e279310ccdb80157de742acca199d97530f5d8e4dc6bc24"

RPROVIDES:${PN} += "createrepo createrepo-implementation createrepo_c createrepo_c(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcreaterepo_c.so.0()(64bit) libcreaterepo_c0 libcreaterepo_c0(aarch-64) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libmodulemd.so.2()(64bit) update-alternatives"

inherit rpm
