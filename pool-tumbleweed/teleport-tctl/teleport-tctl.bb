SUMMARY = "CLI tool for managing a teleport server"
DESCRIPTION = "An administrative tool that can configure Teleport Auth Service."
LICENSE = "Apache-2.0"

PV = "13.2.0"

RPM_NAME = "teleport-tctl-13.2.0-1.1.aarch64.rpm"
RPM_HASH = "650c0a2951f5858d88e107a3b11d9319d6695f587ca8a445fe9c49fd23c8b5c64787e4e9316a5742b58c17c7c0f12f8e6db033b55a02c76cfcb92c1a4210c641"

RPROVIDES:${PN} += "teleport-tctl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
