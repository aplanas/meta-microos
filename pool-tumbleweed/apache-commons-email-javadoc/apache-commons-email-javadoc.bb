SUMMARY = "Javadoc for apache-commons-email"
DESCRIPTION = "This package contains the API documentation for apache-commons-email."
LICENSE = "Apache-2.0"

PV = "1.5"

RPM_NAME = "apache-commons-email-javadoc-1.5-5.6.noarch.rpm"
RPM_HASH = "1536a12d09db5f711a28ab9935e21d429bac903408e7d1d75307fcc872537184c74f8096ccd7b442c900bdf475c7d0b616e7f6d972442ec01eed3e47f627c8fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-email-javadoc"
RDEPENDS:${PN} += ""

inherit rpm
