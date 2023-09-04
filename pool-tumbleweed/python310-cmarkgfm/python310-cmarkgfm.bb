SUMMARY = "Minimal bindings to GitHub's fork of cmark"
DESCRIPTION = "Minimal bindings to GitHub's fork of cmark"
LICENSE = "MIT"

PV = "2022.10.27"

RPM_NAME = "python310-cmarkgfm-2022.10.27-3.1.aarch64.rpm"
RPM_HASH = "09e904d5df60b4e58434cfadca386bf488b20a3ca9e82d8d5e7f4e24d4548e830aaac4e40736a76be2733cd1b1a3e7b0ab0e8e91a9dfe38344489db2f935ca7a"

RPROVIDES:${PN} += "python3.10dist-cmarkgfm \
python310-cmarkgfm \
python3dist-cmarkgfm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-cffi"

inherit rpm
