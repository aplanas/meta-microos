SUMMARY = "A library to create a command-line program from a function"
DESCRIPTION = "Autocommand turns a function into a command-line program. It converts the function's parameter \
signature into command-line arguments, and automatically runs the function if the module was \
called as __main__. In effect, it lets your create a smart main function."
LICENSE = "LGPL-3.0-only"

PV = "2.2.2"

RPM_NAME = "python311-autocommand-2.2.2-2.1.noarch.rpm"
RPM_HASH = "01356dd9b9db8338d1583e308a650172d73d329c0e6469757712d2c6de9db561ef0bcab4cbe444c6c44c43380f8590762d110c9c75e5d93f5ddfb7dab37c385b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(autocommand) \
python311-autocommand \
python3dist(autocommand)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
