SUMMARY = "BND library"
DESCRIPTION = "BND library."
LICENSE = "Apache-2.0"

PV = "5.2.0"

RPM_NAME = "aqute-bndlib-5.2.0-3.1.noarch.rpm"
RPM_HASH = "73b83c775eae1234ffd2dfb6aa1127081706f87d128799ce4604757df9304dabc64de812ac4e591cdd80e2c6c7bc97a9bdaede6b97eefaedd9351ca72ded3f29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aqute-bndlib mvn(biz.aQute.bnd:aQute.libg) mvn(biz.aQute.bnd:aQute.libg:pom:) mvn(biz.aQute.bnd:biz.aQute.bnd.annotation) mvn(biz.aQute.bnd:biz.aQute.bnd.annotation:pom:) mvn(biz.aQute.bnd:biz.aQute.bnd.exporters) mvn(biz.aQute.bnd:biz.aQute.bnd.exporters:pom:) mvn(biz.aQute.bnd:biz.aQute.bndlib) mvn(biz.aQute.bnd:biz.aQute.bndlib:pom:) mvn(biz.aQute.bnd:bndlib) mvn(biz.aQute.bnd:bndlib:pom:) mvn(biz.aQute:bndlib) mvn(biz.aQute:bndlib:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(biz.aQute.bnd:aQute.libg) mvn(biz.aQute.bnd:biz.aQute.bnd.annotation) mvn(org.osgi:osgi.annotation) mvn(org.osgi:osgi.cmpn) mvn(org.osgi:osgi.core) mvn(org.slf4j:slf4j-api) mvn(org.slf4j:slf4j-simple)"

inherit rpm
