SUMMARY = "OpenJDK 8 Source Bundle"
DESCRIPTION = "The OpenJDK 8 source bundle."
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "1.8.0.362"

RPM_NAME = "java-1_8_0-openj9-src-1.8.0.362-2.1.aarch64.rpm"
RPM_HASH = "8e933ee6a9da8792c6b7f561580a361797469b932eebc22613fb689a6fa6bfcffd548036e7661c4721896bbd41e13bc7e5235f85cf46c2dceeecf111c2b8056f"

RPROVIDES:${PN} += "java-1_8_0-openj9-src \
java-1_8_0-openj9-src(aarch-64)"

RDEPENDS:${PN} += "java-1_8_0-openj9"

inherit rpm
