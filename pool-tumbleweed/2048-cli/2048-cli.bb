SUMMARY = "A CLI version of the '2048' game"
DESCRIPTION = "2048 is a mathematics-based puzzle game where the player has to slide \
tiles on a grid to combine them and create a tile with the number 2048. \
The player has to merge the similar number tiles (2n) by moving the arrow \
keys in four different directions. When two tiles with the same number \
touch, they will merge into one."
LICENSE = "MIT"

PV = "0.9.1+git.20181118"

RPM_NAME = "2048-cli-0.9.1+git.20181118-1.16.aarch64.rpm"
RPM_HASH = "7c6c2b09006b74ef9cdba815deed2acc7ff0a0d42e5d50502697e324cd4ed9123df6cf4f83add47925886b2cb18bb916b69a6f4e1f8152c20420621b68bc1302"

RPROVIDES:${PN} += "2048-cli \
2048-cli(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libncurses.so.6()(64bit) \
libtinfo.so.6()(64bit)"

inherit rpm
