SUMMARY = "CLI tool for Machine ID"
DESCRIPTION = "Machine ID is a service that programmatically issues and renews short-lived certificates to any service account (e.g., a CI/CD server) by retrieving credentials from the Teleport Auth Service. This enables fine-grained role-based access controls and audit. \
tbot is the executable belonging to the Machine ID service."
LICENSE = "Apache-2.0"

PV = "13.3.1"

RPM_NAME = "teleport-tbot-13.3.1-1.1.aarch64.rpm"
RPM_HASH = "4e59dbb2c06daea0f877f0a79c9f488f78186d213923d14683d2c003ca038d9221bdbe39bfce0d66f5e64b00004d5239086f6e668a3ddc04452e1d9615addf05"

RPROVIDES:${PN} += "config-teleport-tbot \
teleport-tbot"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6"

inherit rpm
