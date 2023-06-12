SUMMARY = "API documentation for Guice"
DESCRIPTION = "This package provides API documentation for Guice."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "google-guice-javadoc-5.1.0-1.1.noarch.rpm"
RPM_HASH = "8b04c8c7e17f3500114e6716d4ba1deead5543e1a93080d740003d03d441109617680dc018085b18f7ca86d4b64737f60a4a0d9ca14bfbe9a429df038c80c6e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-guice-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
