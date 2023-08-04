SUMMARY = "CLI tool for Machine ID"
DESCRIPTION = "Machine ID is a service that programmatically issues and renews short-lived certificates to any service account (e.g., a CI/CD server) by retrieving credentials from the Teleport Auth Service. This enables fine-grained role-based access controls and audit. \
tbot is the executable belonging to the Machine ID service."
LICENSE = "Apache-2.0"

PV = "13.3.0"

RPM_NAME = "teleport-tbot-13.3.0-1.1.aarch64.rpm"
RPM_HASH = "7b5b137d02a148dab610a5d3b9e00978f5597a0e1e452df6d9edb97c41867a195f592e7d374985e9c33496addd56dd10267637ff1675530cb8029dfa9fc5daf1"

RPROVIDES:${PN} += "config-teleport-tbot \
teleport-tbot"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6"

inherit rpm
