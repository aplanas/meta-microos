SUMMARY = "API documentation for j2objc-annotations"
DESCRIPTION = "This package provides API documentation for j2objc-annotations."
LICENSE = "Apache-2.0"

PV = "2.2"

RPM_NAME = "j2objc-annotations-javadoc-2.2-1.5.noarch.rpm"
RPM_HASH = "017aa36d172513f084c160854219c3aeeefa9fa5582fbf4110b52405c0c1ffa0fc5fade002ff0838bef18c095f49c511ff33a80fb7b3535119f7979b7212761d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "j2objc-annotations-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
