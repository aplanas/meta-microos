SUMMARY = "Development files for libdiscord-rpc"
DESCRIPTION = "Header files for the discord-rpc library."
LICENSE = "MIT"

PV = "3.4.0"

RPM_NAME = "discord-rpc-devel-3.4.0-3.4.aarch64.rpm"
RPM_HASH = "e3d171572ba76b50ecb32a43904f62f540b8c34de0547e8c057a4051e554197ed620bca4bb704d84d5d792b0a798dfd1f0da2daceee8798d7159bdec7c661311"

RPROVIDES:${PN} += "discord-rpc-devel"

RDEPENDS:${PN} += "libdiscord-rpc3-4-0"

inherit rpm
