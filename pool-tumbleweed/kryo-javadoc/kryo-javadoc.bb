SUMMARY = "Javadoc for kryo"
DESCRIPTION = "This package contains javadoc for kryo."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "4.0.2"

RPM_NAME = "kryo-javadoc-4.0.2-2.19.noarch.rpm"
RPM_HASH = "01b78d3a7248e42da587b60f4e8ae57154d05159823d280ad9ffaf97bf19e20c48355ffa633985801d664da361ce188e96261ffe3eade91a6c1c335f52691f94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kryo-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
