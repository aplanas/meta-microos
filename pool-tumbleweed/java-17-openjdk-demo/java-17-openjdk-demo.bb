SUMMARY = "OpenJDK 17 Demos"
DESCRIPTION = "The OpenJDK 17 demos."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "17.0.7.0"

RPM_NAME = "java-17-openjdk-demo-17.0.7.0-3.2.aarch64.rpm"
RPM_HASH = "e301653080e02e5eaac18d69c36de5dac9b462f93ab5cf5cbfe550f06f159e6783307218a28ccaee28f5e7c3c3441f9ac0ed0bc67169df4103985e7c79aff8fc"

RPROVIDES:${PN} += "java-17-openjdk-demo"

RDEPENDS:${PN} += "java-17-openjdk"

inherit rpm
