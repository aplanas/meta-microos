SUMMARY = "Tools for manipulating and analyzing SVG Path objects and Bézier curves"
DESCRIPTION = "Svgpathtools is a collection of tools for manipulating and \
analyzing SVG Path objects and Bézier curves."
LICENSE = "MIT"

PV = "1.6.1"

RPM_NAME = "python310-svgpathtools-1.6.1-1.3.noarch.rpm"
RPM_HASH = "92ac9ed4f712a232ff2eb72f49b1d90a52717d46b9599afb95fa31ba635310a5a8ae4bf849a36b1e5d92ad0c98aa1f1c222265697152374b576b374a43cfdd29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-svgpathtools \
python310-svgpathtools \
python3dist-svgpathtools"

RDEPENDS:${PN} += "python-abi \
python310-numpy \
python310-scipy \
python310-svgwrite"

inherit rpm
