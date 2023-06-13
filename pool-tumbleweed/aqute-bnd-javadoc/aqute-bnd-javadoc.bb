SUMMARY = "Javadoc for aqute-bnd"
DESCRIPTION = "API documentation for aqute-bnd."
LICENSE = "Apache-2.0"

PV = "5.2.0"

RPM_NAME = "aqute-bnd-javadoc-5.2.0-3.1.noarch.rpm"
RPM_HASH = "64e3ac38427245b460da85ea2cecc84e7c2c409adb507858bfc0611cde474420f3081b997eb05d7208aab56df8eb997739e0498e2792a525bf9989f5e47f4bb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aqute-bnd-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
