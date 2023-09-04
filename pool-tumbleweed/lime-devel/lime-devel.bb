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

PV = "5.2.98"

RPM_NAME = "lime-devel-5.2.98-1.1.aarch64.rpm"
RPM_HASH = "ee539df883fdcd5bd54977b78f027383b309ade175995a6182bca52f1807fcfba264ae241f5e5ed042a42db7acfd67da3ca966c92aa2cb829a40750485dce22e"

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
