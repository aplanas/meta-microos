SUMMARY = "JMods for OpenJDK 17"
DESCRIPTION = "The JMods for OpenJDK 17."
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "17.0.6.0"

RPM_NAME = "java-17-openj9-jmods-17.0.6.0-2.3.aarch64.rpm"
RPM_HASH = "eeea4ab06609f7417ee4ffbf6f70c91c247a18e36ffef1bf5994747957882fcda9ac55be6faebf9cd83bd7af0e8fb20c2fca19b7c636ae645825d98c88709631"

RPROVIDES:${PN} += "java-17-openj9-jmods"

RDEPENDS:${PN} += "java-17-openj9-devel"

inherit rpm
