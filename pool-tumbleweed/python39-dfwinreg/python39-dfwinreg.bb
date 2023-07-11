SUMMARY = "Digital Forensics Windows Registry"
DESCRIPTION = "dfwinreg, or Digital Forensics Windows Registry, is a Python module that provides read-only access to Windows Registry objects."
LICENSE = "Apache-2.0"

PV = "0~20211207"

RPM_NAME = "python39-dfwinreg-0~20211207-3.7.noarch.rpm"
RPM_HASH = "02570ad04b7127ae812a2f85079c34931c5d079432c3a7780b55bea77b3d5f53aad70d516a9033cd7e2e4296f9d08d6c8a0584c665907bae175307097412aa5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dfwinreg \
python39-dfwinreg \
python3dist-dfwinreg"

RDEPENDS:${PN} += "python-abi \
python39-libcreg \
python39-libregf"

inherit rpm
