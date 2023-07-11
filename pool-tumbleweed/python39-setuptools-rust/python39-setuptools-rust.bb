SUMMARY = "Setuptools plugin for Rust extensions"
DESCRIPTION = "setuptools-rust is a plugin for setuptools to build Rust Python extensions \
implemented with PyO3 or rust-cpython. \
 \
Compile and distribute Python extensions written in Rust as easily as if they \
were written in C."
LICENSE = "BSD-3-Clause"

PV = "1.6.0"

RPM_NAME = "python39-setuptools-rust-1.6.0-1.3.noarch.rpm"
RPM_HASH = "06b62a1130fe777ddf5b9d82c2b0edddf11eeb715c575f38b5b4609f190db64df351e431f7cf73ec6d82def429294380011e31383838405d3e0db434bdf68121"
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
