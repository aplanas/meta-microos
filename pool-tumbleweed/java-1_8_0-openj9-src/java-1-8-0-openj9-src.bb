SUMMARY = "OpenJDK 8 Source Bundle"
DESCRIPTION = "The OpenJDK 8 source bundle."
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "1.8.0.362"

RPM_NAME = "java-1_8_0-openj9-src-1.8.0.362-2.3.aarch64.rpm"
RPM_HASH = "7fc468d2ba17baa820aba4f24854b7d664568237ff062f2f9e70897a4e8fd2e9929580eccc873287111b28f2170360fb217d714ce33b6cf5ba202ad35213c8c6"

RPROVIDES:${PN} += "java-1-8-0-openj9-src"

RDEPENDS:${PN} += "java-1-8-0-openj9"

inherit rpm
