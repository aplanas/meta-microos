SUMMARY = "Python bindings for SELinux policy analysis"
DESCRIPTION = "SETools is a collection of graphical tools, command-line tools, and \
libraries designed to facilitate SELinux policy analysis."
LICENSE = "LGPL-2.0-only"

PV = "4.4.3"

RPM_NAME = "python311-setools-4.4.3-1.1.aarch64.rpm"
RPM_HASH = "6d50e7dec36de88c29f8aca517c80d9e4906acd58b7e6e523858e64ff5db8b0b6a024c2337a05a03a28c3dc76efa9d386f0a8329549bb844470d4224f31f61f4"

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
