SUMMARY = "A simple future-based async library for python"
DESCRIPTION = "A simple future-based async library for python."
LICENSE = "Apache-2.0"

PV = "0.2.9"

RPM_NAME = "python311-duet-0.2.9-1.1.noarch.rpm"
RPM_HASH = "a92278522d5dc79c481ac31c30082ef886e9fcd5ae89f27d351f1e138faf3556526e241cc7f6a6ce369cf38fb64647b2cfa5f3ef9c81d83035bcb2cef32e20c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-duet \
python3.11dist-duet \
python311-duet \
python3dist-duet"

RDEPENDS:${PN} += "python-abi \
python311-typing-extensions"

inherit rpm
