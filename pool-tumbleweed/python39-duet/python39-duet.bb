SUMMARY = "A simple future-based async library for python"
DESCRIPTION = "A simple future-based async library for python."
LICENSE = "Apache-2.0"

PV = "0.2.9"

RPM_NAME = "python39-duet-0.2.9-1.1.noarch.rpm"
RPM_HASH = "c519bb3ed7e8519b8cc9f4c1e26d1ebd6fb4f67e61fa77034f1f164f5d53a05de7a6353880f0fd748cc98adadff8e0ca4d90c3cbc85b691094e39d9f9291514a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-duet \
python39-duet \
python3dist-duet"

RDEPENDS:${PN} += "python-abi \
python39-typing-extensions"

inherit rpm
