SUMMARY = "Digital Forensics Windows Registry"
DESCRIPTION = "dfwinreg, or Digital Forensics Windows Registry, is a Python module that provides read-only access to Windows Registry objects."
LICENSE = "Apache-2.0"

PV = "0~20211207"

RPM_NAME = "python310-dfwinreg-0~20211207-3.5.noarch.rpm"
RPM_HASH = "21a51f532e6161dd8da5a5b8098ceed5e12a004b935854b424736507b7e83800cda63cd6e32a202cfebb67be255a1b5aad60cdff72f0f5481c41ef6163c0912a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dfwinreg \
python3.10dist(dfwinreg) \
python310-dfwinreg \
python3dist(dfwinreg)"
RDEPENDS:${PN} += "python(abi) \
python310-libcreg \
python310-libregf"

inherit rpm
