SUMMARY = "Setuptools plugin for Rust extensions"
DESCRIPTION = "setuptools-rust is a plugin for setuptools to build Rust Python extensions \
implemented with PyO3 or rust-cpython. \
 \
Compile and distribute Python extensions written in Rust as easily as if they \
were written in C."
LICENSE = "BSD-3-Clause"

PV = "1.6.0"

RPM_NAME = "python39-setuptools-rust-1.6.0-1.1.noarch.rpm"
RPM_HASH = "1d5be115e736224b26def100f989bbf74df871571b6f2e1c3218fe22fbf3aa50c8245fcbb65fcf773978a67ff062d215218c25b2a7bc5195f6cdc79af8295e29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-setuptools-rust \
python39-setuptools-rust \
python3dist-setuptools-rust"

RDEPENDS:${PN} += "cargo \
python-abi \
python39-semantic-version \
python39-setuptools \
python39-typing-extensions \
rust"

inherit rpm
