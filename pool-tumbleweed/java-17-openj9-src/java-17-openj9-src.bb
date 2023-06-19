SUMMARY = "OpenJDK 17 Source Bundle"
DESCRIPTION = "The OpenJDK 17 source bundle."
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "17.0.6.0"

RPM_NAME = "java-17-openj9-src-17.0.6.0-2.1.aarch64.rpm"
RPM_HASH = "79bb9b45ab85f028600a2b4f0500d29accfc6751083867a7604cc9375f55a9987877ed037e9505433186a64ddb5b727597b53445ee61b60c178a3d55dd768073"

RPROVIDES:${PN} += "java-17-openj9-src"

RDEPENDS:${PN} += "java-17-openj9"

inherit rpm
