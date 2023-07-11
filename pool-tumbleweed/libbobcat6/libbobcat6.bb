SUMMARY = "Shared library implementing C++ classes that are frequently used"
DESCRIPTION = "Bobcat is an acronym of `Brokken's Own Base Classes And Templates'. It is a \
shared library implementing C++ classes that are frequently used in software \
developed by Frank Brokken. All of Frank's C++ programs hosted at GitLab \
depend on `bobcat'."
LICENSE = "GPL-3.0-only"

PV = "6.02.02"

RPM_NAME = "libbobcat6-6.02.02-2.4.aarch64.rpm"
RPM_HASH = "4ea2d678dfbd87f547318ae9e2fda43132fa9ae406b498f805c4c4bc8f7f4018a281df63006826bf835380386d3a487a134c4a56e8fbd438bb9c06c2f337a5a1"

RPROVIDES:${PN} += "libbobcat \
libbobcat.so.6 \
libbobcat6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
