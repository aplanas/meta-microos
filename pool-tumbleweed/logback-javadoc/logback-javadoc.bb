SUMMARY = "Javadoc for logback"
DESCRIPTION = "API documentation for the Logback library"
LICENSE = "EPL-1.0 | LGPL-2.1-or-later"

PV = "1.2.11"

RPM_NAME = "logback-javadoc-1.2.11-1.9.noarch.rpm"
RPM_HASH = "ecb7eee60a9215bf38f6cb33f765f0d8b9a7640bdfd36a76cb03cad6b3b7d1efd62b6bd66153daac154575bcc067d64dd178a777be4d8994559d82cc617b2c1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "logback-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
