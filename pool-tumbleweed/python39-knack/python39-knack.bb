SUMMARY = "A Command-Line Interface framework"
DESCRIPTION = "A Command-Line Interface framework"
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "python39-knack-0.10.1-1.3.noarch.rpm"
RPM_HASH = "c8cd2134e05ae43a82b725a23f2cc6c560568c6cb4dde07682ed741b0efdf74e8583ec8672fdd0b402b0bb6d76d3d0608cffb3875cec3094a4eba21491f52a52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(knack) \
python39-knack \
python3dist(knack)"
RDEPENDS:${PN} += "python(abi) \
python39-PyYAML \
python39-argcomplete \
python39-jmespath \
python39-pygments \
python39-tabulate"

inherit rpm
