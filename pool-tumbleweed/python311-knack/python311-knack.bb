SUMMARY = "A Command-Line Interface framework"
DESCRIPTION = "A Command-Line Interface framework"
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "python311-knack-0.10.1-1.3.noarch.rpm"
RPM_HASH = "b660694f07c0368d3536d5abb3a20c98856049e9579b38bc4ffb898fded8c7979959fe322e72c49c264b653093da818e4cf8d50562161812873f6c8d80fa6a52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(knack) \
python311-knack \
python3dist(knack)"
RDEPENDS:${PN} += "python(abi) \
python311-PyYAML \
python311-argcomplete \
python311-jmespath \
python311-pygments \
python311-tabulate"

inherit rpm
