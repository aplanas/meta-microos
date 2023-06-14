SUMMARY = "A library for managing DNS zones"
DESCRIPTION = "A simple library for managing DNS zones."
LICENSE = "BSD-3-Clause"

PV = "0.9.8"

RPM_NAME = "python311-localzone-0.9.8-1.3.noarch.rpm"
RPM_HASH = "352de1bb15240143582c582e0c08a0c5373f9080f0a8a2e4766f21799c7d99c74f25d5ea24690ff3acf5da01b8b41f84db939fca8808c3f79cbc69873a7797c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-localzone \
python311-localzone \
python3dist-localzone"

RDEPENDS:${PN} += "python-abi \
python311-dnspython"

inherit rpm
