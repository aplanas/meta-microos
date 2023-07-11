SUMMARY = "A library to create a command-line program from a function"
DESCRIPTION = "Autocommand turns a function into a command-line program. It converts the function's parameter \
signature into command-line arguments, and automatically runs the function if the module was \
called as __main__. In effect, it lets your create a smart main function."
LICENSE = "LGPL-3.0-only"

PV = "2.2.2"

RPM_NAME = "python39-autocommand-2.2.2-2.3.noarch.rpm"
RPM_HASH = "b611b0f7ab1c9e4f6af578c56fe33bad1e2b66ff0004dd7209621bb49392b5d22f4bbb055196710d047970e055c093d26851cc98a6d69f3835455ab5e2acce88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-autocommand \
python39-autocommand \
python3dist-autocommand"

RDEPENDS:${PN} += "python-abi"

inherit rpm
