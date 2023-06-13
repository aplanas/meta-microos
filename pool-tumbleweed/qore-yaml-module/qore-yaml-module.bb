SUMMARY = "YAML module for Qore"
DESCRIPTION = "This package contains the yaml module for the Qore Programming Language. \
 \
YAML is a flexible and concise human-readable data serialization format."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later | MIT"

PV = "0.7.3"

RPM_NAME = "qore-yaml-module-0.7.3-1.2.aarch64.rpm"
RPM_HASH = "7b7f9b8d04a0e93ef717e728d707c0f1c4cd1415ee6828e26a17eaa40d95ef2a6a35ea3a398c3693e0a61114137c50536c80053e6d8c3a9c9acdc0089413f321"

RPROVIDES:${PN} += "qore-yaml-module \
qore-yaml-module(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libyaml-0.so.2()(64bit) \
qore-module(abi)(aarch-64)"

inherit rpm
