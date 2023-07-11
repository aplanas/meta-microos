SUMMARY = "A configurable sidebar-enabled Sphinx theme"
DESCRIPTION = "A configurable sidebar-enabled Sphinx theme used by aiohttp"
LICENSE = "BSD-3-Clause"

PV = "0.1.6"

RPM_NAME = "python39-aiohttp-theme-0.1.6-2.1.noarch.rpm"
RPM_HASH = "675492892e127ff30a450e7857c26d5f617a6dc9f1910ff410b643cfbdfd27f7de0008ddda967aecda294c2babe231c2a06f3c0ac3f9d451d74a777e7cdf183b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-aiohttp-theme \
python39-aiohttp-theme \
python3dist-aiohttp-theme"

RDEPENDS:${PN} += "python-abi"

inherit rpm
