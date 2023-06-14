SUMMARY = "Python module to patch python built-in objects"
DESCRIPTION = "This project allows you to patch built-in objects, declared in C through \
python."
LICENSE = "GPL-3.0-only | MIT"

PV = "0.1.3"

RPM_NAME = "python311-forbiddenfruit-0.1.3-2.17.aarch64.rpm"
RPM_HASH = "ca24bd9b7efe27ed04af57bef46d6acc77b2fc5f1ef305abe0ea2e576b03863469c75a7fec62d292cc87f2d5225d664d35fe7db8fd5c4edd185096191e395bd0"

RPROVIDES:${PN} += "python3.11dist-forbiddenfruit \
python311-forbiddenfruit \
python3dist-forbiddenfruit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
