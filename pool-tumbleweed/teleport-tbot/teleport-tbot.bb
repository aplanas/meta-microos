SUMMARY = "CLI tool for Machine ID"
DESCRIPTION = "Machine ID is a service that programmatically issues and renews short-lived certificates to any service account (e.g., a CI/CD server) by retrieving credentials from the Teleport Auth Service. This enables fine-grained role-based access controls and audit. \
tbot is the executable belonging to the Machine ID service."
LICENSE = "Apache-2.0"

PV = "13.3.8"

RPM_NAME = "teleport-tbot-13.3.8-1.1.aarch64.rpm"
RPM_HASH = "9f22d72919bde86ccb344f37e8ad2c6a9986fbb783deb1190fa0cd2ae92cf674e0ff0f40421e2386494bcedab94615e05b997a4feea35d2ef0db9d74c4c5f156"

RPROVIDES:${PN} += "config-teleport-tbot \
teleport-tbot"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6"

inherit rpm
