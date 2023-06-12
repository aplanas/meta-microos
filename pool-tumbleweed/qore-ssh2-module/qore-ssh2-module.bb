SUMMARY = "SSH2 module for Qore"
DESCRIPTION = "This module provides access to ssh2 sessions and the sftp protocol \
via libssh2 in the Qore programming language."
LICENSE = "LGPL-2.1-or-later | MIT"

PV = "1.4.1"

RPM_NAME = "qore-ssh2-module-1.4.1-1.9.aarch64.rpm"
RPM_HASH = "d302e837bf98900dc2f6403b558e7736dabebb49f7c2974f575867d04fd40ebe9eda5dbfc950d10a226dba5b71492a068c177f10e454ccc74324c7761899cb7a"

RPROVIDES:${PN} += "qore-ssh2-module \
qore-ssh2-module(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/env \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libqore.so.12()(64bit) \
libssh2.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
qore-module(abi)(aarch-64)"

inherit rpm
