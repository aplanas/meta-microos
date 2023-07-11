SUMMARY = "OpenJDK 11 Demos"
DESCRIPTION = "The OpenJDK 11 demos."
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "11.0.18.0"

RPM_NAME = "java-11-openj9-demo-11.0.18.0-2.3.aarch64.rpm"
RPM_HASH = "07b530a38e230ba20291cfa9809e52cc625145727aae8b8a1a422e08ac72f7f84a764b6536a4a13b55e0222881be9db7b9d7fc3127d74f849eb70e2bb2f885de"

RPROVIDES:${PN} += "java-11-openj9-demo"

RDEPENDS:${PN} += "java-11-openj9"

inherit rpm
