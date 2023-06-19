SUMMARY = "OpenJDK 8 Source Bundle"
DESCRIPTION = "The OpenJDK 8 source bundle."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "1.8.0.372"

RPM_NAME = "java-1_8_0-openjdk-src-1.8.0.372-1.1.aarch64.rpm"
RPM_HASH = "9fa5ac1dbf5965b5d49edcd795d06b2139d9de22beff4ce752e9fbfd7a313f3dc9aadaf787555bea1d8415dcce12477f7436470edda5ff2c027f787c813c9d50"

RPROVIDES:${PN} += "java-1-8-0-openjdk-src"

RDEPENDS:${PN} += "java-1-8-0-openjdk"

inherit rpm
