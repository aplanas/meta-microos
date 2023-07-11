SUMMARY = "Javadoc for plexus-classworlds"
DESCRIPTION = "API documentation for plexus-classworlds."
LICENSE = "Apache-2.0 & Plexus"

PV = "2.6.0"

RPM_NAME = "plexus-classworlds-javadoc-2.6.0-1.5.noarch.rpm"
RPM_HASH = "1dd00fa4e983a78e807bd6ad2462ba249cf877d5be7b4a950a37c5d0f646a9923cc4ff6dbe91ea47d1ff0a1a08f3ae7d8619723cdad24d2db24d4954fd945404"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-classworlds-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
