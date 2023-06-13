SUMMARY = "Support for the SSH protocol via libssh"
DESCRIPTION = "'Libssh::Session' is a perl interface to the libssh (http://www.libssh.org) \
library. It doesn't support all the library. It's working in progress. \
 \
Right now, you can authenticate and execute commands on a SSH server."
LICENSE = "Apache-2.0"

PV = "0.8"

RPM_NAME = "perl-Libssh-Session-0.8-1.2.aarch64.rpm"
RPM_HASH = "eaac3bed236feaafd3d25d2da87f304e227c84b14175a75280bb94fa80432f86bf6defa7b13805acca4d4ad2d320dd6e9f2f902596f32a59e4d324963e3de3df"

RPROVIDES:${PN} += "perl(Libssh::Session) \
perl(Libssh::Sftp) \
perl-Libssh-Session \
perl-Libssh-Session(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libssh.so.4()(64bit) \
libssh.so.4(LIBSSH_4_5_0)(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
