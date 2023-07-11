SUMMARY = "Development files for lime"
DESCRIPTION = "LIME is an encryption library for one-to-one and group instant \
messaging, allowing users to exchange messages privately and \
asynchronously. It supports multiple devices per user and multiple \
users per device. \
 \
The soci development package includes the header files, libraries, \
development tools necessary for compiling and linking applications \
which will use lime."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.73"

RPM_NAME = "lime-devel-5.2.73-1.1.aarch64.rpm"
RPM_HASH = "de38e25ab61eb565e519af9bd027a7e4993aeed4563b1c698fb44404cacc5a02245cec783639b451d7fe27381d3e98d2d0eee5cdc1fd8fcd04b714b22c130f05"

RPROVIDES:${PN} += "lime-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbctoolbox-tester.so.1 \
libbctoolbox.so.1 \
libbellesip.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblime.so.0 \
liblime0 \
libm.so.6 \
libsoci-core.so.4.0 \
libstdc++.so.6 \
soci-devel \
soci-sqlite3-devel"

inherit rpm
