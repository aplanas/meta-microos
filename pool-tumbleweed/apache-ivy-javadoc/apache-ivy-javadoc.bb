SUMMARY = "API Documentation for ivy"
DESCRIPTION = "JavaDoc documentation for apache-ivy"
LICENSE = "Apache-2.0"

PV = "2.5.1"

RPM_NAME = "apache-ivy-javadoc-2.5.1-1.3.noarch.rpm"
RPM_HASH = "0ae044690f490097d286e960e52b7ba993ef079600347a1e040e260db712ff6763e911c13972dbecfde17dec6e1604eceaa7b30efaf33064a2e42e3ca8aece7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-ivy-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
