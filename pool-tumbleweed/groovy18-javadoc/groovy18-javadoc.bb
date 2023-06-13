SUMMARY = "API Documentation for groovy18"
DESCRIPTION = "JavaDoc documentation for groovy18"
LICENSE = "Apache-2.0"

PV = "1.8.9"

RPM_NAME = "groovy18-javadoc-1.8.9-7.7.noarch.rpm"
RPM_HASH = "a23468cfad16a3c1796e92272772ec70d0ebf4b9b030d34bab60ad4b3d40e4ddcac5f2208de6cca09ea4c8f7a3c61bf2f0056f3dd526422c80e22dd93ee718cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "groovy18-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
