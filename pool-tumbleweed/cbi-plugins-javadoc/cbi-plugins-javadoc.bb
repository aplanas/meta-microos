SUMMARY = "Javadoc for cbi-plugins"
DESCRIPTION = "API documentation for cbi-plugins."
LICENSE = "EPL-1.0"

PV = "1.1.5"

RPM_NAME = "cbi-plugins-javadoc-1.1.5-4.9.noarch.rpm"
RPM_HASH = "46adcbad8e22b0f1f27051714cc6999b0c2393278a3c57f1998a2a9c1435053ad8dfb47d633ca86d43b174964e69b2a866fc27dbd794c923734be235cbcbd14f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cbi-plugins-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
