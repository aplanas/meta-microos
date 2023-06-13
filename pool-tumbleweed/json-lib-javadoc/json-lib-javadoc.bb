SUMMARY = "Javadoc for json-lib"
DESCRIPTION = "API documentation for json-lib."
LICENSE = "Apache-2.0"

PV = "2.4"

RPM_NAME = "json-lib-javadoc-2.4-6.10.noarch.rpm"
RPM_HASH = "a7ecb29852144ae8d0f0c43cbf83aa95fb85db11d572bdc3026dfc58929bf47187744c1ba064e591edf8e248c1e1efff061b4590be918c151e104f2782369188"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "json-lib-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
