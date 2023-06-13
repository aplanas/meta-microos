SUMMARY = "Python module for setting attributes of target functions or classes"
DESCRIPTION = "A decorator to set attributes of target function or class in a DRY way."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "python39-attr-0.3.2-1.4.noarch.rpm"
RPM_HASH = "1d83cba86937fa603ec205eef3386ec6b48826578507e1706e2187a396d764a9ed421bde832177519e1b6ea0c3bee57ee3cc5e2912190f755770769edb0387ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(attr) \
python39-attr \
python3dist(attr)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
