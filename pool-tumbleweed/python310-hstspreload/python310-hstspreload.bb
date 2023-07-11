SUMMARY = "Python Chromium HSTS Preload list"
DESCRIPTION = "Chromium HSTS Preload list as a Python package."
LICENSE = "BSD-3-Clause"

PV = "2023.1.1"

RPM_NAME = "python310-hstspreload-2023.1.1-1.5.noarch.rpm"
RPM_HASH = "22deda069a4fec5d3bc83dd6d0ca7caf41442fc92021c44538a22bb65a9081576be94a53f44e13d8f14a0847abf34b123724d1e88e0f5782b7d634c8a3aa9dd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-hstspreload \
python310-hstspreload \
python3dist-hstspreload"

RDEPENDS:${PN} += "python-abi"

inherit rpm
