SUMMARY = "Digital Forensics Windows Registry"
DESCRIPTION = "dfwinreg, or Digital Forensics Windows Registry, is a Python module that provides read-only access to Windows Registry objects."
LICENSE = "Apache-2.0"

PV = "0~20211207"

RPM_NAME = "python310-dfwinreg-0~20211207-4.1.noarch.rpm"
RPM_HASH = "ee3cf7fc51d07d3d38a337dc4d3ccac1e862fc56df57b498992be9fe07694b57a0acfb94c2a7ad804238f8335b805e9de77872c737add728825fb358e2096317"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-dfwinreg \
python310-dfwinreg \
python3dist-dfwinreg"

RDEPENDS:${PN} += "python-abi \
python310-libcreg \
python310-libregf"

inherit rpm
