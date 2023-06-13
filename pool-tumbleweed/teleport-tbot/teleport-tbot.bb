SUMMARY = "CLI tool for Machine ID"
DESCRIPTION = "Machine ID is a service that programmatically issues and renews short-lived certificates to any service account (e.g., a CI/CD server) by retrieving credentials from the Teleport Auth Service. This enables fine-grained role-based access controls and audit. \
tbot is the executable belonging to the Machine ID service."
LICENSE = "Apache-2.0"

PV = "13.0.3"

RPM_NAME = "teleport-tbot-13.0.3-1.1.aarch64.rpm"
RPM_HASH = "092162d3ee31a2cf1fc2801f175b2352e86fd8da45ad821be90ac1fc78c6c8b629d9e8db9084a42d1eb5e73a52bc599aaf3af5990c7d24d82962f6a5ae6616f5"

RPROVIDES:${PN} += "config(teleport-tbot) \
teleport-tbot \
teleport-tbot(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
