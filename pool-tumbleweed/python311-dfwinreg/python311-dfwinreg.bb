SUMMARY = "Digital Forensics Windows Registry"
DESCRIPTION = "dfwinreg, or Digital Forensics Windows Registry, is a Python module that provides read-only access to Windows Registry objects."
LICENSE = "Apache-2.0"

PV = "0~20211207"

RPM_NAME = "python311-dfwinreg-0~20211207-3.7.noarch.rpm"
RPM_HASH = "1c043865b0fb916edc9f794b995a3247d0d290ad92f829d2a30493114cd1dff1f45b201fcc3e4912eb03b8f0ab6ffef5c04d19cbd8c57e4ecdf132f639bd2f19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dfwinreg \
python3.11dist-dfwinreg \
python311-dfwinreg \
python3dist-dfwinreg"

RDEPENDS:${PN} += "python-abi \
python311-libcreg \
python311-libregf"

inherit rpm
