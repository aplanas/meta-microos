SUMMARY = "CLI tool for Machine ID"
DESCRIPTION = "Machine ID is a service that programmatically issues and renews short-lived certificates to any service account (e.g., a CI/CD server) by retrieving credentials from the Teleport Auth Service. This enables fine-grained role-based access controls and audit. \
tbot is the executable belonging to the Machine ID service."
LICENSE = "Apache-2.0"

PV = "13.2.2"

RPM_NAME = "teleport-tbot-13.2.2-1.1.aarch64.rpm"
RPM_HASH = "c7bd470910e577c31109421e1dba1924f4c750d4644c5f73c174bcb82cdc3b05fcef2db5d3c63a8531933d137726cbbc3fd5d6573e2d882e90e25700d47d8ea2"

RPROVIDES:${PN} += "config-teleport-tbot \
teleport-tbot"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6"

inherit rpm
