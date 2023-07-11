SUMMARY = "A configurable sidebar-enabled Sphinx theme"
DESCRIPTION = "A configurable sidebar-enabled Sphinx theme used by aiohttp"
LICENSE = "BSD-3-Clause"

PV = "0.1.6"

RPM_NAME = "python311-aiohttp-theme-0.1.6-2.1.noarch.rpm"
RPM_HASH = "17bd1c75fa94c074e6120502d23d01a13312c96571f21c879e34404aec3b6ce47fd4a3463d5119c97d76dee7e52230a07788cd0f1ec1976dcba7fcc6112e6296"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aiohttp-theme \
python3.11dist-aiohttp-theme \
python311-aiohttp-theme \
python3dist-aiohttp-theme"

RDEPENDS:${PN} += "python-abi"

inherit rpm
