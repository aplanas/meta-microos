SUMMARY = "OpenJDK 13 Source Bundle"
DESCRIPTION = "The OpenJDK 13 source bundle."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "13.0.14.0"

RPM_NAME = "java-13-openjdk-src-13.0.14.0-2.3.aarch64.rpm"
RPM_HASH = "ed498d3379ce4ea81976bb7bf26bbc741ebdf17e59bf44b4496e6ee5dfc44b33d1236e703d291062c04fface640d69beae587b1ee55c4335f8650651363352b5"

RPROVIDES:${PN} += "java-13-openjdk-src"

RDEPENDS:${PN} += "java-13-openjdk"

inherit rpm
