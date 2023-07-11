SUMMARY = "Base Package for Integrated Development Environments"
DESCRIPTION = "This package contains the common plugins for integrated developments \
environment based on the KDevelop framework."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kdevplatform-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "fca20e7aad9396eeae35676b908616fa29e12c55381483c71fefccd66988c3fecb2f389f2bbb084d9ecdddfd1d1e31ea9ea7be8f1984cec1cb12c2f695962c73"

RPROVIDES:${PN} += "kdevplatform"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
/usr/bin/zsh \
grantlee5 \
ld-linux-aarch64.so.1 \
libGrantlee-Templates.so.5 \
libKDevPlatformLanguage.so.511 \
libQt5Core.so.5 \
libc.so.6 \
libkdevplatform511 \
libstdc++.so.6"

inherit rpm
