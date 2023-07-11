SUMMARY = "Setuptools plugin for Rust extensions"
DESCRIPTION = "setuptools-rust is a plugin for setuptools to build Rust Python extensions \
implemented with PyO3 or rust-cpython. \
 \
Compile and distribute Python extensions written in Rust as easily as if they \
were written in C."
LICENSE = "BSD-3-Clause"

PV = "1.6.0"

RPM_NAME = "python311-setuptools-rust-1.6.0-1.3.noarch.rpm"
RPM_HASH = "278e8030d4644e8a513cfea483458d2aea2a5e5e30e6df284450274a9c844733c71dbae7617672d09faf9cccaebaa6153ef492260ecf18bf37731507b313511f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-setuptools-rust \
python3.11dist-setuptools-rust \
python311-setuptools-rust \
python3dist-setuptools-rust"

RDEPENDS:${PN} += "cargo \
python-abi \
python311-semantic-version \
python311-setuptools \
python311-typing-extensions \
rust"

inherit rpm
