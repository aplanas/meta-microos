SUMMARY = "Setuptools plugin for Rust extensions"
DESCRIPTION = "setuptools-rust is a plugin for setuptools to build Rust Python extensions \
implemented with PyO3 or rust-cpython. \
 \
Compile and distribute Python extensions written in Rust as easily as if they \
were written in C."
LICENSE = "BSD-3-Clause"

PV = "1.6.0"

RPM_NAME = "python310-setuptools-rust-1.6.0-1.3.noarch.rpm"
RPM_HASH = "734896d6714ab65af991b24a299505ded9b8e65cb87c578d305734bf794c824b5e87fcd72261fa1140ee62616e0713a539d9f5a957b0471d4cb6b7200f9850f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-setuptools-rust \
python310-setuptools-rust \
python3dist-setuptools-rust"

RDEPENDS:${PN} += "cargo \
python-abi \
python310-semantic-version \
python310-setuptools \
python310-typing-extensions \
rust"

inherit rpm
