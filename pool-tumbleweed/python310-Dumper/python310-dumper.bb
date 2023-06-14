SUMMARY = "Tool to conveniently describe any Python datastructure"
DESCRIPTION = "Tool to conveniently describe any Python datastructure"
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python310-Dumper-1.2.0-2.6.noarch.rpm"
RPM_HASH = "a52e4c6eee46f767b6c37dc98d16c78d3bd8ea598c403b3ddc8202e2d75f5dfe073745c29da0851d22c798728b20224af8b1a8df5dd304777212e5b3dee008b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Dumper \
python3.10dist-dumper \
python310-Dumper \
python3dist-dumper"

RDEPENDS:${PN} += "python-abi"

inherit rpm
