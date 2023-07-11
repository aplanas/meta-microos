SUMMARY = "Javadoc for felix-gogo-shell"
DESCRIPTION = "This package contains the API documentation for felix-gogo-shell."
LICENSE = "Apache-2.0"

PV = "1.1.4"

RPM_NAME = "felix-gogo-shell-javadoc-1.1.4-1.4.noarch.rpm"
RPM_HASH = "bd4127dbd0fea7b3f6662b9164fb43df5e3c9ae519deaeb494beaeda34794ae75da787b70ab1b36ca778a23be37c232d944f3ba994d4b0159a03bedf6e0c3304"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "felix-gogo-shell-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
