SUMMARY = "OpenJDK 17 Source Bundle"
DESCRIPTION = "The OpenJDK 17 source bundle."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "17.0.7.0"

RPM_NAME = "java-17-openjdk-src-17.0.7.0-3.2.aarch64.rpm"
RPM_HASH = "75cba33fdae39eebb967a15721c7ff4e3f65e257e1739bee76b49f07c20a9b7e7734df59d3711f547a2536ffddc9b13ddd5a71eeddc91ba0b3c08d5cf5aceb9a"

RPROVIDES:${PN} += "java-17-openjdk-src"

RDEPENDS:${PN} += "java-17-openjdk"

inherit rpm
