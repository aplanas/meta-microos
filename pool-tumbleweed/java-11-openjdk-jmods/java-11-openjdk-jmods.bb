SUMMARY = "JMods for OpenJDK 11"
DESCRIPTION = "The JMods for OpenJDK 11."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "11.0.19.0"

RPM_NAME = "java-11-openjdk-jmods-11.0.19.0-1.2.aarch64.rpm"
RPM_HASH = "8cbfeadbcebe3ff3d144231f25bd9fe625663c50b75897d34d595f5b36bf3ecd0e21c7d1f9ed664f0d62f6a017262c7ea0cca6d863a60b4c5853fb08eff669a0"

RPROVIDES:${PN} += "java-10-openjdk-jmods \
java-11-openjdk-jmods"

RDEPENDS:${PN} += "java-11-openjdk-devel"

inherit rpm
