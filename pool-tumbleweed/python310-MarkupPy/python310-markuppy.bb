SUMMARY = "An HTML/XML generator"
DESCRIPTION = "This is MarkupPy - a Python module that for generating HTML/XML \
for Python programs."
LICENSE = "SUSE-Public-Domain"

PV = "1.14"

RPM_NAME = "python310-MarkupPy-1.14-1.16.noarch.rpm"
RPM_HASH = "479a04bc7023ddd6153fcfd4d2fca47270add2f6ab0b7c3fd90e9266453864df1db788752ee0675d47c56cea780f43a705f347dab85069084bdf124ae6ee3c0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-markuppy \
python310-MarkupPy \
python3dist-markuppy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
