SUMMARY = "CLI tool for managing a teleport server"
DESCRIPTION = "An administrative tool that can configure Teleport Auth Service."
LICENSE = "Apache-2.0"

PV = "13.3.8"

RPM_NAME = "teleport-tctl-13.3.8-1.1.aarch64.rpm"
RPM_HASH = "630377c9370f3989c16f07f7bd9b304f245515560be6669cef712a6b22c6744139372aa1f7b519f0a1db24d6134c276f71e6e6b43b8f6913b9e57c6cb521a060"

RPROVIDES:${PN} += "teleport-tctl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
