SUMMARY = "CLI tool for Machine ID"
DESCRIPTION = "Machine ID is a service that programmatically issues and renews short-lived certificates to any service account (e.g., a CI/CD server) by retrieving credentials from the Teleport Auth Service. This enables fine-grained role-based access controls and audit. \
tbot is the executable belonging to the Machine ID service."
LICENSE = "Apache-2.0"

PV = "13.2.1"

RPM_NAME = "teleport-tbot-13.2.1-1.1.aarch64.rpm"
RPM_HASH = "23c645d58cb96605c50309b133fea48bd03861578447f0c6dc7229991236a7716a3245de9d6f6fc02b8b4d81d95dddbdc8a80964b0e63723c2edf8b30ce074d4"

RPROVIDES:${PN} += "config-teleport-tbot \
teleport-tbot"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6"

inherit rpm
