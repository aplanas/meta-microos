SUMMARY = "Javadoc for reflectasm"
DESCRIPTION = "This package contains javadoc for reflectasm."
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "reflectasm-javadoc-1.11.1-1.4.noarch.rpm"
RPM_HASH = "fd2613678d79b0273b0e01635e53c87fa5c974b07242f9ed186b7386a100df685820115a260972fe6e81855e1248ba46e857269941782308ba987821ffc1f623"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "reflectasm-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
