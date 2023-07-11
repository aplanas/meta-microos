SUMMARY = "HTTP/2 framing layer for Python"
DESCRIPTION = "This library contains the HTTP/2 framing code used in the hyper project. \
It provides a pure-Python codebase that is capable of decoding a binary \
stream into HTTP/2 frames."
LICENSE = "MIT"

PV = "6.0.1"

RPM_NAME = "python311-hyperframe-6.0.1-2.3.noarch.rpm"
RPM_HASH = "f3960385c04994f6da7608cade4936ab124e407908a95c2bac5f1efb0c968a613485631a4c6a44ddc3a871949f5ba84e8f21608bdbc4de09aebdd8b357349aec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hyperframe \
python3.11dist-hyperframe \
python311-hyperframe \
python3dist-hyperframe"

RDEPENDS:${PN} += "python-abi"

inherit rpm
