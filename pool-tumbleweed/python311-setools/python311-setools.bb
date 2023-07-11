SUMMARY = "Python bindings for SELinux policy analysis"
DESCRIPTION = "SETools is a collection of graphical tools, command-line tools, and \
libraries designed to facilitate SELinux policy analysis."
LICENSE = "LGPL-2.0-only"

PV = "4.4.2"

RPM_NAME = "python311-setools-4.4.2-1.2.aarch64.rpm"
RPM_HASH = "b14a542309a547ba91461b592f1e4c5c57284bc1ee2265e6b20a41149f957218fc038258599e16f04d65ed910e3c48721157be9dc26bfa3a86cac96ffcf0910b"

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
python3"

inherit rpm
