SUMMARY = "CLI tool for Machine ID"
DESCRIPTION = "Machine ID is a service that programmatically issues and renews short-lived certificates to any service account (e.g., a CI/CD server) by retrieving credentials from the Teleport Auth Service. This enables fine-grained role-based access controls and audit. \
tbot is the executable belonging to the Machine ID service."
LICENSE = "Apache-2.0"

PV = "13.2.5"

RPM_NAME = "teleport-tbot-13.2.5-1.1.aarch64.rpm"
RPM_HASH = "812c99b439fc76643423cecc7d43bb21f434b531a70e81c8dfc43c8c00bd5f0e37dc984894b7c25d67016c4ce51bdb8050cbf2d1acb5861c3aada87724486c75"

RPROVIDES:${PN} += "config-teleport-tbot \
teleport-tbot"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6"

inherit rpm
