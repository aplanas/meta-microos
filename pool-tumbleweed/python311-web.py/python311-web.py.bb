SUMMARY = "web.py: makes web apps"
DESCRIPTION = "Think about the ideal way to write a web app. Write the code to make it happen."
LICENSE = "BSD-3-Clause & SUSE-Public-Domain"

PV = "0.62"

RPM_NAME = "python311-web.py-0.62-3.10.noarch.rpm"
RPM_HASH = "87a73adba47c8833fbb645853c86dcfd70e220bcefbca25aaa5f87537b7dc9a92739b81241375abaafeda25ec21d6b62a4e826fbc9548bae735ad9483fed986f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-web.py \
python3.11dist-web.py \
python311-web.py \
python3dist-web.py"

RDEPENDS:${PN} += "python-abi \
python311-cheroot"

inherit rpm
