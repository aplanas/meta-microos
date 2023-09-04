SUMMARY = "OpenJDK 8 Source Bundle"
DESCRIPTION = "The OpenJDK 8 source bundle."
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "1.8.0.382"

RPM_NAME = "java-1_8_0-openj9-src-1.8.0.382-1.1.aarch64.rpm"
RPM_HASH = "519c6ff6ea23c71339cec0faf61dcb5bc7c583b4092a6fb783f4335ba6ec6d72f2650c51e63528f71913020612547007e9f367552891237f43c8585fb58058ea"

RPROVIDES:${PN} += "java-1-8-0-openj9-src"

RDEPENDS:${PN} += "java-1-8-0-openj9"

inherit rpm
