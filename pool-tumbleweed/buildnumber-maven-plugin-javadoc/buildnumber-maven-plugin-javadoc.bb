SUMMARY = "Javadoc for buildnumber-maven-plugin"
DESCRIPTION = "API documentation for buildnumber-maven-plugin."
LICENSE = "Apache-2.0 & MIT"

PV = "1.3"

RPM_NAME = "buildnumber-maven-plugin-javadoc-1.3-2.10.noarch.rpm"
RPM_HASH = "7b1cb58ceb3b68a078ea9a4edc85e78b5cc435795a5283d94885f315f2a8cf1cf65f29121c91a2d4c08485393a314a8f3a91fadb919ff65762e7e68773ad3f0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "buildnumber-maven-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
