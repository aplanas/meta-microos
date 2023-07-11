SUMMARY = "Javadoc for javamail"
DESCRIPTION = "Javadoc for javamail."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.5.2"

RPM_NAME = "javamail-javadoc-1.5.2-7.5.noarch.rpm"
RPM_HASH = "cb979b4b014b9c86a849dd068d26f9fde7e895af84d29ab08467cad70478c68b1ae1d8a57f6659a8d617f047cab6bbccf9df7859f42b87ca4f715e24934f893a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javamail-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
