SUMMARY = "Python package providing assets pygaljs"
DESCRIPTION = "Python package providing assets from https://github.com/Kozea/pygal.js"
LICENSE = "GPL-3.0-or-later"

PV = "1.0.2"

RPM_NAME = "python310-pygaljs-1.0.2-2.3.noarch.rpm"
RPM_HASH = "1bc1ad86602b2e296b24c8bcfbba2a09994ba1fbcafb9d7e729b83e45bdbb256d1123a85a23a3673f98dc3786900e30d6abca9db600ffc1686b89dbaf6442d93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pygaljs \
python310-pygaljs \
python3dist-pygaljs"

RDEPENDS:${PN} += "python-abi"

inherit rpm
