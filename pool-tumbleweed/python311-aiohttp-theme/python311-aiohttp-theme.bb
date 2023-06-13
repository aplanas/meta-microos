SUMMARY = "A configurable sidebar-enabled Sphinx theme"
DESCRIPTION = "A configurable sidebar-enabled Sphinx theme used by aiohttp"
LICENSE = "BSD-3-Clause"

PV = "0.1.6"

RPM_NAME = "python311-aiohttp-theme-0.1.6-1.14.noarch.rpm"
RPM_HASH = "a6049f03f444951ad7ac5bee45f4f1e2379b6f2d1d31f1a39afb599921199c5725739d2b7fefb74337edee4437581ef35c8fa9c6161ac01ae4fc3376519390cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(aiohttp-theme) \
python311-aiohttp-theme \
python3dist(aiohttp-theme)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
