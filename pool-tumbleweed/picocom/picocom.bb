SUMMARY = "Minimal dumb-terminal emulation program"
DESCRIPTION = "picocom is a dumb-terminal emulation program, similar to 'minicom', \
for the purpose of manual modem configuration, testing, and \
debugging. It can be used as a low-tech 'terminal window' to allow \
operator intervention in PPP connection scripts (something like the \
'open terminal window before / after dialing' feature in MS Windows)."
LICENSE = "GPL-2.0"

PV = "3.1"

RPM_NAME = "picocom-3.1-1.19.aarch64.rpm"
RPM_HASH = "d142d6d232e41af9acced4b960b328b54a3db47eb977f324265e58d018b70c51104fab1af35daf509b88ef3bd356a76811814050c99cbf922a1fc63eb84fc6c2"

RPROVIDES:${PN} += "picocom"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
