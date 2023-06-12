SUMMARY = "Setuptools plugin for Rust extensions"
DESCRIPTION = "setuptools-rust is a plugin for setuptools to build Rust Python extensions \
implemented with PyO3 or rust-cpython. \
 \
Compile and distribute Python extensions written in Rust as easily as if they \
were written in C."
LICENSE = "BSD-3-Clause"

PV = "1.6.0"

RPM_NAME = "python310-setuptools-rust-1.6.0-1.1.noarch.rpm"
RPM_HASH = "b451487b746a9601d44264f18ffe8c61b38eec3fa7afe638825b7bf15ae6f80519216700df36092be5fbd802bbfe2c6bc7c553fe192c6671f87f2c2cf1169310"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-setuptools-rust \
python3.10dist(setuptools-rust) \
python310-setuptools-rust \
python3dist(setuptools-rust)"
RDEPENDS:${PN} += "cargo \
python(abi) \
python310-semantic_version \
python310-setuptools \
python310-typing_extensions \
rust"

inherit rpm
