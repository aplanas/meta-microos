SUMMARY = "Tools for manipulating and analyzing SVG Path objects and Bézier curves"
DESCRIPTION = "Svgpathtools is a collection of tools for manipulating and \
analyzing SVG Path objects and Bézier curves."
LICENSE = "MIT"

PV = "1.6.1"

RPM_NAME = "python39-svgpathtools-1.6.1-1.3.noarch.rpm"
RPM_HASH = "b8e9e8719f7e78a7ac2ca3f36bc321459742a54685d01cce2b0c0aa40718e38598b4c5b4d23b84a4c6337bd29b34a4da3c016d445c8634d2aa340e634e7822f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-svgpathtools \
python39-svgpathtools \
python3dist-svgpathtools"

RDEPENDS:${PN} += "python-abi \
python39-numpy \
python39-scipy \
python39-svgwrite"

inherit rpm
