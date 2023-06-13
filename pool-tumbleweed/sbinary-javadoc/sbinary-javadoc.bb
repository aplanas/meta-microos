SUMMARY = "Javadoc for sbinary"
DESCRIPTION = "Javadoc for sbinary."
LICENSE = "MIT"

PV = "0.4.2"

RPM_NAME = "sbinary-javadoc-0.4.2-4.1.noarch.rpm"
RPM_HASH = "2f91a2a13bd02a5747b104b3f12217b035555c77b6485bded398671c5abb78a58600532b33c6c04cae1e2577f24bb31076c89ebf01e6f867da7508320b8b4238"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sbinary-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
