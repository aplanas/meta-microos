SUMMARY = "Digital Forensics Windows Registry"
DESCRIPTION = "dfwinreg, or Digital Forensics Windows Registry, is a Python module that provides read-only access to Windows Registry objects."
LICENSE = "Apache-2.0"

PV = "0~20211207"

RPM_NAME = "python311-dfwinreg-0~20211207-4.1.noarch.rpm"
RPM_HASH = "65660dc20d99f34f44c054c40747682e60142124aab861ca64bd1cc66cd68fb75cce8735d81c9cd8aeece023f51c2f97338e47a81b400e5a139fe8d731bac637"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dfwinreg \
python3.11dist-dfwinreg \
python311-dfwinreg \
python3dist-dfwinreg"

RDEPENDS:${PN} += "python-abi \
python311-libcreg \
python311-libregf"

inherit rpm
