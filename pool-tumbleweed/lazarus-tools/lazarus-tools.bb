SUMMARY = "Lazarus IDE helper programs"
DESCRIPTION = "Lazarus is a cross-platform IDE and component library for Free Pascal. \
This package provides helper programs used for building Lazarus projects."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.6"

RPM_NAME = "lazarus-tools-2.2.6-2.1.aarch64.rpm"
RPM_HASH = "dc8eb90881c113c98759453687113f4157ae9114db07a271aab8eed9e94effceaa50b7bf07546d858c1420da9e1d5afa64a43db51666b77c43c92e7716483ce5"

RPROVIDES:${PN} += "config-lazarus-tools \
lazarus-tools"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/instantfpc \
/usr/bin/sh \
binutils \
fpc \
glibc-devel \
libc.so.6"

inherit rpm
