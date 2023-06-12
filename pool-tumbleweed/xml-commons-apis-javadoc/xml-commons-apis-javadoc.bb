SUMMARY = "Javadoc for xml-commons-apis"
DESCRIPTION = "Javadoc for xml-commons-apis."
LICENSE = "Apache-2.0 & W3C & SUSE-Public-Domain"

PV = "1.4.01"

RPM_NAME = "xml-commons-apis-javadoc-1.4.01-4.6.noarch.rpm"
RPM_HASH = "67afa608a570932ed9e54ad093a5df91a60df3f9d369df0d549e8e72d50d05e1af5a5965e8689f8823c064224274a3d973914948cd6023d456f6705dbe880016"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xml-commons-apis-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
