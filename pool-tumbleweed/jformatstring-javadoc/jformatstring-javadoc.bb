SUMMARY = "Javadoc for jformatstring"
DESCRIPTION = "Javadoc for jformatstring."
LICENSE = "GPL-2.0-only"

PV = "0.10~20131207"

RPM_NAME = "jformatstring-javadoc-0.10~20131207-3.7.noarch.rpm"
RPM_HASH = "4571e272109fefdb3ae6806884fca3e66306e88bb6242529b02c3ba829880e42614f595a9f2ff36258a5be6a611ba992f2ab8caebd003fe41d18bbcee1d8b05e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jformatstring-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
