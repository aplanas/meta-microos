SUMMARY = "API documentation for itextpdf"
DESCRIPTION = "This package contains the API documentation for itextpdf."
LICENSE = "AGPL-3.0-only"

PV = "5.5.13.3"

RPM_NAME = "itextpdf-javadoc-5.5.13.3-1.11.noarch.rpm"
RPM_HASH = "4d71f5a10468924e16f2928fb7a9295b21e6968ed3032ddd515d08c512aeaf014e8ee099c52e256bdea652053256e9aa02aa0b873330389c2e075d896a27cf8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "itextpdf-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
