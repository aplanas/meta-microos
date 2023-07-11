SUMMARY = "A configurable sidebar-enabled Sphinx theme"
DESCRIPTION = "A configurable sidebar-enabled Sphinx theme used by aiohttp"
LICENSE = "BSD-3-Clause"

PV = "0.1.6"

RPM_NAME = "python310-aiohttp-theme-0.1.6-2.1.noarch.rpm"
RPM_HASH = "cfa4668dda9d84167270e623dd004ba5aa5296c0ca55d89c1645a23f7445c74bdcc96531c2502e0bf75303c97f47815fac0193f81f51c8469b4355fdf0afa203"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-aiohttp-theme \
python310-aiohttp-theme \
python3dist-aiohttp-theme"

RDEPENDS:${PN} += "python-abi"

inherit rpm
