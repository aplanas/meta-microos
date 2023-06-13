SUMMARY = "A configurable sidebar-enabled Sphinx theme"
DESCRIPTION = "A configurable sidebar-enabled Sphinx theme used by aiohttp"
LICENSE = "BSD-3-Clause"

PV = "0.1.6"

RPM_NAME = "python39-aiohttp-theme-0.1.6-1.14.noarch.rpm"
RPM_HASH = "59470eda09b6bf81fd8c72695c171779b4195b6ffe7e73a640466db70f3eca7620cb3996b45679de9e8a527655d40ac920f63193a8eeee6d14274dd42815ac63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(aiohttp-theme) \
python39-aiohttp-theme \
python3dist(aiohttp-theme)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
