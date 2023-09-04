SUMMARY = "Digital Forensics Windows Registry"
DESCRIPTION = "dfwinreg, or Digital Forensics Windows Registry, is a Python module that provides read-only access to Windows Registry objects."
LICENSE = "Apache-2.0"

PV = "0~20211207"

RPM_NAME = "python39-dfwinreg-0~20211207-4.1.noarch.rpm"
RPM_HASH = "f736c1d1870ae867297e32b05b9da7893dbcc8cfe2e94e0f0e3b70fba66a94207c0ffb83c4fb96d510bde1df040434e7acfd89b9c7fe12d9c2a6a0b570653639"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dfwinreg \
python39-dfwinreg \
python3dist-dfwinreg"

RDEPENDS:${PN} += "python-abi \
python39-libcreg \
python39-libregf"

inherit rpm
