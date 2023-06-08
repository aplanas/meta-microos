SUMMARY = "Development files for libdiscord-rpc"
DESCRIPTION = "Header files for the discord-rpc library."
LICENSE = "MIT"

PV = "3.4.0"

RPM_NAME = "discord-rpc-devel-3.4.0-3.3.aarch64.rpm"
RPM_HASH = "49f287e8920bcfc2337aed613fbced649e6ec07a76c07527a4149e19de7b013f05c44d8d8ff0edda0e008da062a3e330502aa0cb8dc3901cb8a49ff3980172ba"

RPROVIDES:${PN} += "discord-rpc-devel discord-rpc-devel(aarch-64)"
RDEPENDS:${PN} += "libdiscord-rpc3_4_0"

inherit rpm
