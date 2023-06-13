SUMMARY = "XML Im-/Exporter"
DESCRIPTION = "XML Im-/Exporter is a low level library to assist you in the straight \
forward process of importing and exporting XML from and to your Java \
classes. All of this is designed having performance and simplicity in \
mind."
LICENSE = "LGPL-2.0-or-later"

PV = "1.1"

RPM_NAME = "xml-im-exporter-1.1-29.6.noarch.rpm"
RPM_HASH = "d8434b1ba4c3253e9b0dd86f78d5845b899fcf4e656b3f38c0308df346b180ac0d3f9ef42122eded4efd9c01dc076f3b125108b1c601b2e7f8aa0e0d268eb94e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(de.zeigermann.xml:xml-im-exporter) \
mvn(de.zeigermann.xml:xml-im-exporter:pom:) \
xml-im-exporter"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
