SUMMARY = "Minimal bindings to GitHub's fork of cmark"
DESCRIPTION = "Minimal bindings to GitHub's fork of cmark"
LICENSE = "MIT"

PV = "2022.10.27"

RPM_NAME = "python311-cmarkgfm-2022.10.27-3.1.aarch64.rpm"
RPM_HASH = "c8300f4654d6de5bd34c367fe57d9568a6e2ed742d32ad4ea973490f381e26f26de02764376b151162d7b27158e09b9eebade2337dbb84164ec653ca5bb32b61"

RPROVIDES:${PN} += "python3-cmarkgfm \
python3.11dist-cmarkgfm \
python311-cmarkgfm \
python3dist-cmarkgfm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-cffi"

inherit rpm
