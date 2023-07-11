SUMMARY = "Digital Forensics Windows Registry"
DESCRIPTION = "dfwinreg, or Digital Forensics Windows Registry, is a Python module that provides read-only access to Windows Registry objects."
LICENSE = "Apache-2.0"

PV = "0~20211207"

RPM_NAME = "python310-dfwinreg-0~20211207-3.7.noarch.rpm"
RPM_HASH = "cf1758b8e94edff7cff767d4ca83f1e054483d9845bfefb78ecc4946bcb1effb64cba0cf0da4817e8ef6d3655953da845aba344370d9ad3d40c905c937dce5c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-dfwinreg \
python310-dfwinreg \
python3dist-dfwinreg"

RDEPENDS:${PN} += "python-abi \
python310-libcreg \
python310-libregf"

inherit rpm
