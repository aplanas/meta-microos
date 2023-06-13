SUMMARY = "Support multiple formats with ease"
DESCRIPTION = "Formats will provide you with a consistent API to parse and compose data."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python311-formats-0.1.1-1.14.noarch.rpm"
RPM_HASH = "627b9e63f36ee8c62e9782cf9cea7be45a9466a10d5c99898917738dcc37f723f7f50c246684453b1e7350248f50c8bdac631dc001f31044640fb2a812cf43c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(formats) \
python311-formats \
python3dist(formats)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
