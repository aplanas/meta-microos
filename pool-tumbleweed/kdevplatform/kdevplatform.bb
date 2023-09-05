SUMMARY = "Base Package for Integrated Development Environments"
DESCRIPTION = "This package contains the common plugins for integrated developments \
environment based on the KDevelop framework."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kdevplatform-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "583200a6a967cd89e8f5c0f1eb53b248a2b916f21578fbf12c277dbcbfa65014dabcb327822b62977c333f76a4a5db16b1c4f4c0c65aa6905a30f2e14dd98dab"

RPROVIDES:${PN} += "kdevplatform"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
/usr/bin/zsh \
grantlee5 \
ld-linux-aarch64.so.1 \
libGrantlee-Templates.so.5 \
libKDevPlatformLanguage.so.512 \
libQt5Core.so.5 \
libc.so.6 \
libkdevplatform512 \
libstdc++.so.6"

inherit rpm
