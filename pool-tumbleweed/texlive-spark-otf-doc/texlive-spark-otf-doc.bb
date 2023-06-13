SUMMARY = "Documentation for texlive-spark-otf"
DESCRIPTION = "This package includes the documentation for texlive-spark-otf"
LICENSE = "OFL-1.1"

PV = "2023.201.0.0.05asvn62481"

RPM_NAME = "texlive-spark-otf-doc-2023.201.0.0.05asvn62481-57.1.noarch.rpm"
RPM_HASH = "822a235ddede37a317251c75dc2c0c2724ee1adfde72c7f16580de170f713e1e70967349e572685b3074aac729f3036678e6cb93d3946e6fecc9bba2822c803d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-spark-otf-doc"

RDEPENDS:${PN} += ""

inherit rpm
