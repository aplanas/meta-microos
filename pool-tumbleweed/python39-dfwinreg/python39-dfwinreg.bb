SUMMARY = "Digital Forensics Windows Registry"
DESCRIPTION = "dfwinreg, or Digital Forensics Windows Registry, is a Python module that provides read-only access to Windows Registry objects."
LICENSE = "Apache-2.0"

PV = "0~20211207"

RPM_NAME = "python39-dfwinreg-0~20211207-3.5.noarch.rpm"
RPM_HASH = "9574e992baa585280ec720e47ce3bf349458527dae1c4b2c718962fed28c54ba2e797c348ec202bcdfa5adfdfac8626425431d4b73100bb5e6915c11f7bda88a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dfwinreg \
python39-dfwinreg \
python3dist-dfwinreg"

RDEPENDS:${PN} += "python-abi \
python39-libcreg \
python39-libregf"

inherit rpm
