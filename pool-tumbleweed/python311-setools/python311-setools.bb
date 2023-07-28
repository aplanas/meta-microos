SUMMARY = "Python bindings for SELinux policy analysis"
DESCRIPTION = "SETools is a collection of graphical tools, command-line tools, and \
libraries designed to facilitate SELinux policy analysis."
LICENSE = "LGPL-2.0-only"

PV = "4.4.2"

RPM_NAME = "python311-setools-4.4.2-2.1.aarch64.rpm"
RPM_HASH = "79d7e459d1411eaee112caea570bc01efa058d94e3cd54507009dd921f5f0cb83f082743038789003ebf826820bb3e73199869d4e6d070f6e208ecd7743da7bf"

RPROVIDES:${PN} += "python-setools \
python3-setools \
python3.11dist-setools \
python311-setools \
python3dist-setools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libselinux.so.1 \
libsepol.so.2 \
python-abi \
python3 \
python3-setuptools"

inherit rpm
