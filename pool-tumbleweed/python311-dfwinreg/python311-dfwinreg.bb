SUMMARY = "Digital Forensics Windows Registry"
DESCRIPTION = "dfwinreg, or Digital Forensics Windows Registry, is a Python module that provides read-only access to Windows Registry objects."
LICENSE = "Apache-2.0"

PV = "0~20211207"

RPM_NAME = "python311-dfwinreg-0~20211207-3.5.noarch.rpm"
RPM_HASH = "c048a08f6d844d36c58a056090076900286c5f99c96b96e6a2d005e8ce69337d6ec8c2bf1703596d781a5a8bec07826434737796085c2d5c9fdabe5b62a327e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(dfwinreg) \
python311-dfwinreg \
python3dist(dfwinreg)"

RDEPENDS:${PN} += "python(abi) \
python311-libcreg \
python311-libregf"

inherit rpm
