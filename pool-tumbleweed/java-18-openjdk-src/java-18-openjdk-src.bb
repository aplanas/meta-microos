SUMMARY = "OpenJDK 18 Source Bundle"
DESCRIPTION = "The OpenJDK 18 source bundle."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "18.0.2.0"

RPM_NAME = "java-18-openjdk-src-18.0.2.0-4.3.aarch64.rpm"
RPM_HASH = "5cc9174dc4532b52274690785ca881ce33189e5bc352db2c9c736cd98061179aeb225bac18479f1d017073a3cbed220d47d0d62ecab9fb9eb48f0d857f0c4ce2"

RPROVIDES:${PN} += "java-18-openjdk-src \
java-18-openjdk-src(aarch-64)"

RDEPENDS:${PN} += "java-18-openjdk"

inherit rpm
