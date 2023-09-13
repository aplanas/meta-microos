SUMMARY = "API documentation for apache-commons-ognl"
DESCRIPTION = "This package contains the API documentation for apache-commons-ognl."
LICENSE = "Apache-2.0"

PV = "4.0~20191021git51cf8f4"

RPM_NAME = "apache-commons-ognl-javadoc-4.0~20191021git51cf8f4-5.1.noarch.rpm"
RPM_HASH = "1361d21fe79a8301556fd014c0dbb0374d1e1df110a26ef59f56751b0cd02ee091f6a2c27c9164f0d62aadb49165e00de930a2f1a5ab6a500d725b33460d6cd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-ognl-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
