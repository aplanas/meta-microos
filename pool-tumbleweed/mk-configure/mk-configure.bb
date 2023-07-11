SUMMARY = "A build system on top of bmake"
DESCRIPTION = "mk-configure is a collection of include files for bmake (portable version of \
NetBSD make) and a number of executables. It is intended to aid cross-platform \
development and software building."
LICENSE = "BSD-2-Clause & MIT & ISC"

PV = "0.38.2"

RPM_NAME = "mk-configure-0.38.2-1.3.noarch.rpm"
RPM_HASH = "29561a18f3e9c7d39aebdc21c0f2e36ee1397fd0de79a846f8e9e868a91a9b56cb87eb9f5df517e63331a29262bb9f8ebb5e2eb27e37589e96a74c9228c125b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mk-configure \
mk-configure-rpm-macros \
rpm-macro-mkcmake"

RDEPENDS:${PN} += "/usr/bin/awk \
/usr/bin/sh \
bmake \
bmkdep"

inherit rpm
