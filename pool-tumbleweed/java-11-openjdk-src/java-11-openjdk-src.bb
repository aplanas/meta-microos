SUMMARY = "OpenJDK 11 Source Bundle"
DESCRIPTION = "The OpenJDK 11 source bundle."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "11.0.20.0"

RPM_NAME = "java-11-openjdk-src-11.0.20.0-1.1.aarch64.rpm"
RPM_HASH = "8e570d7181ea4cfd62ac4bd2d900f2d97cdc6ae6117193cd233141c79537225e4108a60839c9d5b998bbfce2833e05ca837c7ab61a6578d998d9b28e37c70242"

RPROVIDES:${PN} += "java-10-openjdk-src \
java-11-openjdk-src"

RDEPENDS:${PN} += "java-11-openjdk"

inherit rpm
