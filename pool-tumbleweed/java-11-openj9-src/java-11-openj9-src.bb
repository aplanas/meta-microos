SUMMARY = "OpenJDK 11 Source Bundle"
DESCRIPTION = "The OpenJDK 11 source bundle."
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "11.0.18.0"

RPM_NAME = "java-11-openj9-src-11.0.18.0-2.3.aarch64.rpm"
RPM_HASH = "364b95831d6f1586c8b518f7ab4508a44f1983f333f8a350a3fa52eb100ce33c9f02130037d82318448225551fcc5213269d9489aad2b73738ddfb14918e2d1a"

RPROVIDES:${PN} += "java-11-openj9-src"

RDEPENDS:${PN} += "java-11-openj9"

inherit rpm
