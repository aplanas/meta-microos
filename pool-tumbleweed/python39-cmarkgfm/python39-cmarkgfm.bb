SUMMARY = "Minimal bindings to GitHub's fork of cmark"
DESCRIPTION = "Minimal bindings to GitHub's fork of cmark"
LICENSE = "MIT"

PV = "2022.10.27"

RPM_NAME = "python39-cmarkgfm-2022.10.27-3.1.aarch64.rpm"
RPM_HASH = "a7bf7c078a5d183b9aac606675558d25666b5828dd10675a91ac5dd842a2dfc90dfba2a0385985aa27852ce8e7499c17078cec39f46ab12e16aa109d16aee256"

RPROVIDES:${PN} += "python3.9dist-cmarkgfm \
python39-cmarkgfm \
python3dist-cmarkgfm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-cffi"

inherit rpm
