SUMMARY = "Platform Independent File Lock in Python"
DESCRIPTION = "This package contains a single module, which implements a platform \
independent file lock in Python, which provides a simple way of \
inter-process communication."
LICENSE = "Unlicense"

PV = "3.12.3"

RPM_NAME = "python310-filelock-3.12.3-1.1.noarch.rpm"
RPM_HASH = "45738fcf1809441755ab4121b4087daf5efbae6d26f1dd61f8bc3ab1c210d3289e255a226e84a6697928b0f96972d72fa71ffadfb827e4c3cabf890bc029162d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-filelock \
python310-filelock \
python3dist-filelock"

RDEPENDS:${PN} += "python-abi \
python310-typing-extensions"

inherit rpm
