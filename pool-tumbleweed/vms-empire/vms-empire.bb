SUMMARY = "Simulation of a full-scale war between two emperors"
DESCRIPTION = "The ancestor of all 4x (expand/explore/exploit/exterminate) games. \
VMS-Empire is a simulation of a full-scale war between two emperors, \
the computer and you. Naturally, there is only room for one, so the \
object of the game is to destroy the other. The computer plays by the \
same rules that you do. This game is the ancestor of all the multiplayer \
4X simulations out there, including Civilization and Master of Orion."
LICENSE = "GPL-2.0-only"

PV = "1.16"

RPM_NAME = "vms-empire-1.16-1.8.aarch64.rpm"
RPM_HASH = "a8a40d0777d92281277cbf1ad9adb324a6a7f03ee4fbb34820c9f3104c7aa9e7b92a3c8335d603bd0b9eef2985d71bed9c1c4b0b87f5f91aeb448aca540b9bba"

RPROVIDES:${PN} += "vms-empire"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
