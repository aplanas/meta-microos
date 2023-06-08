SUMMARY = "API documentation for apache-commons-ognl"
DESCRIPTION = "This package contains the API documentation for apache-commons-ognl."
LICENSE = "Apache-2.0"

PV = "4.0~20191021git51cf8f4"

RPM_NAME = "apache-commons-ognl-javadoc-4.0~20191021git51cf8f4-4.4.noarch.rpm"
RPM_HASH = "2d350a617cfde7ef57360e5df38e550b293ec6e6dff1796a809fd2848c5d037028452e3b05f69628cf24857473720189a05285d894e3f36472384772030d79c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-ognl-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
