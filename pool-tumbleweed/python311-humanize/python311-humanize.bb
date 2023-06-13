SUMMARY = "Python humanize utilities"
DESCRIPTION = "This modest package contains various common humanization utilities, like turning \
a number into a fuzzy human readable duration ('3 minutes ago') or into a human \
readable size or throughput."
LICENSE = "MIT"

PV = "4.4.0"

RPM_NAME = "python311-humanize-4.4.0-1.3.noarch.rpm"
RPM_HASH = "9608672b7f726fa39bc03cf4acb24219bfc28653001abab173e6ce8a2cdf991c179da0d977a70205e16373be86cd61759553e5f25d6b3c26df3562a3e161a078"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(humanize) \
python311-humanize \
python3dist(humanize)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
