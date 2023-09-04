SUMMARY = "OpenJDK 8 API Documentation"
DESCRIPTION = "The OpenJDK 8 API documentation."
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "1.8.0.382"

RPM_NAME = "java-1_8_0-openj9-javadoc-1.8.0.382-1.1.noarch.rpm"
RPM_HASH = "c890b2fbf843db5a395aac537912853682bfea72c7f1b436b82ecc93cf3eba757f64213b8921eab5e0b91a8ec2846b76b64e9bc4e716043cb33054375150f702"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "java-1-8-0-openj9-javadoc \
java-1.8.0-javadoc \
java-javadoc"

RDEPENDS:${PN} += "/usr/bin/sh \
jpackage-utils \
update-alternatives"

inherit rpm
