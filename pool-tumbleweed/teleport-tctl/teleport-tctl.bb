SUMMARY = "CLI tool for managing a teleport server"
DESCRIPTION = "An administrative tool that can configure Teleport Auth Service."
LICENSE = "Apache-2.0"

PV = "13.0.3"

RPM_NAME = "teleport-tctl-13.0.3-1.1.aarch64.rpm"
RPM_HASH = "14c3d5ca93e570d66dc97b7751eddd069560add8f0f425cab11cf777bdd41ddd0b18929f1139c74fbf20f02eac9a3041c5f742bc0686fe07db37eaf2b8f6749f"

RPROVIDES:${PN} += "teleport-tctl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
