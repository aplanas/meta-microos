SUMMARY = "JMods for OpenJDK 17"
DESCRIPTION = "The JMods for OpenJDK 17."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "17.0.8.0"

RPM_NAME = "java-17-openjdk-jmods-17.0.8.0-1.1.aarch64.rpm"
RPM_HASH = "882501f481d701064b4e6cf9846d8c29053491627c46c65c1a4f3ebcab9189e829ca8e6beb3e7c10bcaa950300b45084c5670978d0190c447faebce28ec3ee8a"

RPROVIDES:${PN} += "java-17-openjdk-jmods"

RDEPENDS:${PN} += "java-17-openjdk-devel"

inherit rpm
