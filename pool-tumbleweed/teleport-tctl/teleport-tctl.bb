SUMMARY = "CLI tool for managing a teleport server"
DESCRIPTION = "An administrative tool that can configure Teleport Auth Service."
LICENSE = "Apache-2.0"

PV = "13.3.1"

RPM_NAME = "teleport-tctl-13.3.1-1.1.aarch64.rpm"
RPM_HASH = "22a189f9395309577d018cccb80d1509134a4fda8c58b6c5ab09206203c8f97236cc95a569686737f8b156ac0b0b65764c10c02af034d29b35d872594dc2c50a"

RPROVIDES:${PN} += "teleport-tctl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
