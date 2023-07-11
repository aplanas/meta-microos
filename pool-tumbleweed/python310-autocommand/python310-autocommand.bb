SUMMARY = "A library to create a command-line program from a function"
DESCRIPTION = "Autocommand turns a function into a command-line program. It converts the function's parameter \
signature into command-line arguments, and automatically runs the function if the module was \
called as __main__. In effect, it lets your create a smart main function."
LICENSE = "LGPL-3.0-only"

PV = "2.2.2"

RPM_NAME = "python310-autocommand-2.2.2-2.3.noarch.rpm"
RPM_HASH = "c80c5069891e611f32fcd3a30ea3c6b2f492e3e68f85a24431cad289f920bc4a2aeea000fd43e083019f202fa5a3ed7270540cdee75f5322d196becb1fc8c5a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-autocommand \
python310-autocommand \
python3dist-autocommand"

RDEPENDS:${PN} += "python-abi"

inherit rpm
