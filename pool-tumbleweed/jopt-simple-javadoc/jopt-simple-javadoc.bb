SUMMARY = "Javadoc for jopt-simple"
DESCRIPTION = "This package contains the API documentation for jopt-simple."
LICENSE = "MIT"

PV = "5.0.4"

RPM_NAME = "jopt-simple-javadoc-5.0.4-1.20.noarch.rpm"
RPM_HASH = "2f6f6c0724d402c80fe45da8d9b011f9cb72227a5416bb273fbe691e38f2f9304d67e97345edbf53b3653f37fd5b8daa574166f40226ea6845f20e9c5a6c2f4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jopt-simple-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
