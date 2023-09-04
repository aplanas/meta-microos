SUMMARY = "OpenJDK 17 Source Bundle"
DESCRIPTION = "The OpenJDK 17 source bundle."
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "17.0.8.0"

RPM_NAME = "java-17-openj9-src-17.0.8.0-2.1.aarch64.rpm"
RPM_HASH = "db2cd12fa58c1d71f090214d5d37b4a2052611df4d1280171fd38e4d3d80ac6ba759a1917bc462fd7ad4825eb10556ab1d18e4f93aa5fe8ca4edb5c6ca44e9ec"

RPROVIDES:${PN} += "java-17-openj9-src"

RDEPENDS:${PN} += "java-17-openj9"

inherit rpm
