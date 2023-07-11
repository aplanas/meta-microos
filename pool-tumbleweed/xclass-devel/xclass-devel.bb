SUMMARY = "Development files for xclass"
DESCRIPTION = "This package contains development files for xclass library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.2"

RPM_NAME = "xclass-devel-0.9.2-188.7.aarch64.rpm"
RPM_HASH = "8cf56d575098d487ee7e74f0453be427ba8cda6642b413be802261d389d4f18197c8bafce0a3f69e85f61a8f9d5b538c03a716c835a2b2cb395c41e1638f5928"

RPROVIDES:${PN} += "xclass-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
libstdc++-devel \
libxclass-0-9-2 \
pkgconfig \
pkgconfig-gl \
pkgconfig-x11 \
pkgconfig-xpm"

inherit rpm
