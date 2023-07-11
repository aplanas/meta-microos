SUMMARY = "A library to create a command-line program from a function"
DESCRIPTION = "Autocommand turns a function into a command-line program. It converts the function's parameter \
signature into command-line arguments, and automatically runs the function if the module was \
called as __main__. In effect, it lets your create a smart main function."
LICENSE = "LGPL-3.0-only"

PV = "2.2.2"

RPM_NAME = "python311-autocommand-2.2.2-2.3.noarch.rpm"
RPM_HASH = "ecdf8526007513bbabb13cb7f6c320e0313db75cceaf694f61129737aefce060672a60af908f5c84570733bccbb07ea25de322e77407f828f7889223fbe9de2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-autocommand \
python3.11dist-autocommand \
python311-autocommand \
python3dist-autocommand"

RDEPENDS:${PN} += "python-abi"

inherit rpm
