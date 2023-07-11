SUMMARY = "Python humanize utilities"
DESCRIPTION = "This modest package contains various common humanization utilities, like turning \
a number into a fuzzy human readable duration ('3 minutes ago') or into a human \
readable size or throughput."
LICENSE = "MIT"

PV = "4.4.0"

RPM_NAME = "python310-humanize-4.4.0-1.5.noarch.rpm"
RPM_HASH = "45a01f96364e13e42dda0fb61d162715170cc51e9a7d67cb71a88355d97a707b216f8ba46f83b2867ffe2cde15591c9d101efc62d671266cc25ab0445e0ae55c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-humanize \
python310-humanize \
python3dist-humanize"

RDEPENDS:${PN} += "python-abi"

inherit rpm
