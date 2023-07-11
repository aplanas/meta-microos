SUMMARY = "Javadoc for jackson-modules-base"
DESCRIPTION = "This package contains API documentation for jackson-modules-base."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-modules-base-javadoc-2.13.3-1.8.noarch.rpm"
RPM_HASH = "134dfa5a997f06fb091b8ea55ca72384eab0785a17a7ebe77d743a572e11848aee0d7030058263e496ad6567af1092494e5e7f3065d42e03ce41d30a5520ca0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-modules-base-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
