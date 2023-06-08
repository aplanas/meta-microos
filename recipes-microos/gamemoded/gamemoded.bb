SUMMARY = "The GameMode daemon required by GameMode enabled games"
DESCRIPTION = "GameMode is a daemon/lib combo for Linux that allows games to request \
a set of optimisations be temporarily applied to the host OS. \
 \
The GameMode daemon is installed as a D-Bus Service and will start \
automatically on first access by a client."
LICENSE = "BSD-3-Clause"

PV = "1.7"

RPM_NAME = "gamemoded-1.7-2.2.aarch64.rpm"
RPM_HASH = "07d46ef4a9dedb484befdb59bce92ce334965f6c8e53bab375c0944a38aca497b952c1cc6c928f5dde43255d9857c37e7babd9de15da64a59f5b2767c6b4aba0"

RPROVIDES:${PN} += "gamemoded gamemoded(aarch-64) metainfo() metainfo(io.github.feralinteractive.gamemode.metainfo.xml)"
RDEPENDS:${PN} += "/bin/bash ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libinih.so.0()(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit) libsystemd.so.0(LIBSYSTEMD_221)(64bit) libsystemd.so.0(LIBSYSTEMD_243)(64bit)"

inherit rpm
