SUMMARY = "Minimal bindings to GitHub's fork of cmark"
DESCRIPTION = "Minimal bindings to GitHub's fork of cmark"
LICENSE = "MIT"

PV = "2022.10.27"

RPM_NAME = "python311-cmarkgfm-2022.10.27-2.3.aarch64.rpm"
RPM_HASH = "c12a9c9acd89bb5200d911c693b23ce4b881ed762299fd01bf5beb4c22356469764a96b17255e670d7820f459a73e7092f9a2f7438aaad3e2fe8c03bc58ebe74"

RPROVIDES:${PN} += "python3-cmarkgfm \
python3.11dist-cmarkgfm \
python311-cmarkgfm \
python3dist-cmarkgfm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-cffi"

inherit rpm
