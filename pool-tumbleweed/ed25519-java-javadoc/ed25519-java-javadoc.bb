SUMMARY = "Javadoc for ed25519-java"
DESCRIPTION = "This package contains javadoc for ed25519-java."
LICENSE = "CC0-1.0"

PV = "0.3.0"

RPM_NAME = "ed25519-java-javadoc-0.3.0-2.11.noarch.rpm"
RPM_HASH = "2db0a6c7f799c7e01d39794dae4cdc608fe98cdf748dd1443c9fa4135ea25778e50a5718a4c2b222b943abb572bbd8847cc9044eff2acc68472933d115e47d4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ed25519-java-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
