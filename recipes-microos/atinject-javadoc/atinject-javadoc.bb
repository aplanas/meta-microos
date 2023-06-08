SUMMARY = "API documentation for atinject"
DESCRIPTION = "API documentation for atinject."
LICENSE = "Apache-2.0"

PV = "1+20160610git1f74ea7"

RPM_NAME = "atinject-javadoc-1+20160610git1f74ea7-2.6.noarch.rpm"
RPM_HASH = "8234d74cf1adb128134ca5bc709e267ac980ef0d1ee008c396988dd16a7215263b89ff2cbca00be347164e8dc76663eaa1c6b17d125d6f56b044276bf4103a21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "atinject-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
