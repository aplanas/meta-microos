SUMMARY = "Javadoc for maven-invoker"
DESCRIPTION = "API documentation for maven-invoker."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "maven-invoker-javadoc-3.1.0-2.3.noarch.rpm"
RPM_HASH = "a2e7d269fd58bc989da4181c48a17e3f01b4fb1739b7441d65eca6b831b092aebc1c1eae58027093da91b91a2206c42e8217e3d6c20ac22a3096b203118594da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-invoker-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
