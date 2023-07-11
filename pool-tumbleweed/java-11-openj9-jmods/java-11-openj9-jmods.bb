SUMMARY = "JMods for OpenJDK 11"
DESCRIPTION = "The JMods for OpenJDK 11."
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "11.0.18.0"

RPM_NAME = "java-11-openj9-jmods-11.0.18.0-2.3.aarch64.rpm"
RPM_HASH = "683e66c4b0cd31f42ad510b399473e41e814f1bc21ac5eb38e8979791b303e87389a32efd1dc451c5ca6a37a92385a3d4c92afd927b3dfc6d917dd7f78ec9d72"

RPROVIDES:${PN} += "java-11-openj9-jmods"

RDEPENDS:${PN} += "java-11-openj9-devel"

inherit rpm
