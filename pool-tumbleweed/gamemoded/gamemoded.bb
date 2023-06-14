SUMMARY = "The GameMode daemon required by GameMode enabled games"
DESCRIPTION = "GameMode is a daemon/lib combo for Linux that allows games to request \
a set of optimisations be temporarily applied to the host OS. \
 \
The GameMode daemon is installed as a D-Bus Service and will start \
automatically on first access by a client."
LICENSE = "BSD-3-Clause"

PV = "1.7"

RPM_NAME = "gamemoded-1.7-3.1.aarch64.rpm"
RPM_HASH = "e4cc9942fd2c5c0ed083382fa2039667d361c09847d85a1ad57ef32134ec6f7d317a33042855290029cc55432e621dee76290e89589777437e6a83368866051b"

RPROVIDES:${PN} += "gamemoded"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libinih.so.0 \
libsystemd.so.0"

inherit rpm
