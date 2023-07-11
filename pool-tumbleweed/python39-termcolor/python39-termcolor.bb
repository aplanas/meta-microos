SUMMARY = "ANSII Color formatting for output in terminal"
DESCRIPTION = "Available text colors: grey, red, green, yellow, blue, magenta, cyan, white. \
Available text highlights: on_grey, on_red, on_green, on_yellow, on_blue, on_magenta, on_cyan, on_white. \
Available attributes: bold, dark, underline, blink, reverse, concealed."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "python39-termcolor-2.1.1-2.3.noarch.rpm"
RPM_HASH = "de5e127f861fb72c681b473301a455699c43b837bf891400dbfec56ec078b2d9f0e314ab2265d149f8eda54d21d8a8c5cdcfca7ff6315135e34080c3d3f2ce6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-termcolor \
python39-termcolor \
python3dist-termcolor"

RDEPENDS:${PN} += "python-abi"

inherit rpm
