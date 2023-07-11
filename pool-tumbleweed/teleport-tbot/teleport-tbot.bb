SUMMARY = "CLI tool for Machine ID"
DESCRIPTION = "Machine ID is a service that programmatically issues and renews short-lived certificates to any service account (e.g., a CI/CD server) by retrieving credentials from the Teleport Auth Service. This enables fine-grained role-based access controls and audit. \
tbot is the executable belonging to the Machine ID service."
LICENSE = "Apache-2.0"

PV = "13.2.0"

RPM_NAME = "teleport-tbot-13.2.0-1.1.aarch64.rpm"
RPM_HASH = "21aaa3a194daac49b72157edbe432e86ac08659b7cef990105e142c41269a5b966a7499c79b3fd41575f059e4393d833d3dae5fac35ef70294832184d909a578"

RPROVIDES:${PN} += "config-teleport-tbot \
teleport-tbot"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6"

inherit rpm
