SUMMARY = "Shared library implementing C++ classes that are frequently used"
DESCRIPTION = "Bobcat is an acronym of `Brokken's Own Base Classes And Templates'. It is a \
shared library implementing C++ classes that are frequently used in software \
developed by Frank Brokken. All of Frank's C++ programs hosted at GitLab \
depend on `bobcat'."
LICENSE = "GPL-3.0-only"

PV = "6.02.02"

RPM_NAME = "libbobcat6-6.02.02-2.3.aarch64.rpm"
RPM_HASH = "84b596dbe634587ce818092a5eaafd166f2f03d918acb3af7bd390ddf4b0994accee9073e6d112131387540c3ea7d6aa1a257bb7b00e90af349863243d0ca184"

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
