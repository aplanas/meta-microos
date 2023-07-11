SUMMARY = "Javadoc for apiguardian"
DESCRIPTION = "API documentation for apiguardian."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "apiguardian-javadoc-1.0.0-2.7.noarch.rpm"
RPM_HASH = "562bd04e2405e52825f5ed81e8d8fc3b2a2f08b306363fe988b883f1915ae8c80e353341ed9999691bdf30b69af77c70616d74bead8345119f7d7b0447b6a5ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apiguardian-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
