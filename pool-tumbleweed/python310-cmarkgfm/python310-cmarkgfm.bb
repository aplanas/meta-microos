SUMMARY = "Minimal bindings to GitHub's fork of cmark"
DESCRIPTION = "Minimal bindings to GitHub's fork of cmark"
LICENSE = "MIT"

PV = "2022.10.27"

RPM_NAME = "python310-cmarkgfm-2022.10.27-2.1.aarch64.rpm"
RPM_HASH = "15ed485903964a6f789f8454d2bf308457828bd06a6188d3d05ae89c95d7e992f821e534a0222aa907ba01c732de293b4a2037fec4b15b617f5f2ab6e6709c41"

RPROVIDES:${PN} += "python3-cmarkgfm \
python3.10dist-cmarkgfm \
python310-cmarkgfm \
python3dist-cmarkgfm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-cffi"

inherit rpm
