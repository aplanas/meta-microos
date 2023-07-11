SUMMARY = "Python humanize utilities"
DESCRIPTION = "This modest package contains various common humanization utilities, like turning \
a number into a fuzzy human readable duration ('3 minutes ago') or into a human \
readable size or throughput."
LICENSE = "MIT"

PV = "4.4.0"

RPM_NAME = "python311-humanize-4.4.0-1.5.noarch.rpm"
RPM_HASH = "4ba6502c05986bb3546c7f193a5ed481040f5848b4a5dddabb569c5f3102a0878c2fd6f0714dfe4e2c7aae2358ce422f0af044f39c13ec124f765be07fc0c466"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-humanize \
python3.11dist-humanize \
python311-humanize \
python3dist-humanize"

RDEPENDS:${PN} += "python-abi"

inherit rpm
