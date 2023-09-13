SUMMARY = "Javadoc for maven-dependency-tree"
DESCRIPTION = "This package contains javadoc for maven-dependency-tree."
LICENSE = "Apache-2.0"

PV = "3.0.1"

RPM_NAME = "maven-dependency-tree-javadoc-3.0.1-4.1.noarch.rpm"
RPM_HASH = "090a991bc99deb50745df3d1209e6746c63c45a091e1451498c7aaf38c107caef13ffa9e22c92db1c13b97cf37aab1fd73c5cc3bb92e27d0d880dfabf4add4fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-dependency-tree-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
