SUMMARY = "Setuptools plugin for Rust extensions"
DESCRIPTION = "setuptools-rust is a plugin for setuptools to build Rust Python extensions \
implemented with PyO3 or rust-cpython. \
 \
Compile and distribute Python extensions written in Rust as easily as if they \
were written in C."
LICENSE = "BSD-3-Clause"

PV = "1.6.0"

RPM_NAME = "python311-setuptools-rust-1.6.0-1.1.noarch.rpm"
RPM_HASH = "105097d0288e8e0b4eca46f0f4e67aef99c7f805c70e771b1d14107236a7501459b4d176ea046c9d83231b91d3c8da75fc312287926d5cb41921a52c4d2cc563"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(setuptools-rust) \
python311-setuptools-rust \
python3dist(setuptools-rust)"
RDEPENDS:${PN} += "cargo \
python(abi) \
python311-semantic_version \
python311-setuptools \
python311-typing_extensions \
rust"

inherit rpm
