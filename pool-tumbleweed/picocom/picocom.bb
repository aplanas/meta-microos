SUMMARY = "Minimal dumb-terminal emulation program"
DESCRIPTION = "picocom is a dumb-terminal emulation program, similar to 'minicom', \
for the purpose of manual modem configuration, testing, and \
debugging. It can be used as a low-tech 'terminal window' to allow \
operator intervention in PPP connection scripts (something like the \
'open terminal window before / after dialing' feature in MS Windows)."
LICENSE = "GPL-2.0"

PV = "3.1"

RPM_NAME = "picocom-3.1-1.20.aarch64.rpm"
RPM_HASH = "83e3bef21aef85f265f78cd4f65172ecfaf5d400d2726dd91bf3053a1d1f2f83e0568f9f9ffb8653756a9e065c160d72146eb65f0a805fd54c64cced45c6e4d9"

RPROVIDES:${PN} += "picocom"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
