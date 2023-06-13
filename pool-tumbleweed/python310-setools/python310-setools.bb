SUMMARY = "Python bindings for SELinux policy analysis"
DESCRIPTION = "SETools is a collection of graphical tools, command-line tools, and \
libraries designed to facilitate SELinux policy analysis."
LICENSE = "LGPL-2.0-only"

PV = "4.4.2"

RPM_NAME = "python310-setools-4.4.2-1.1.aarch64.rpm"
RPM_HASH = "aeb511309a30d3c6cab6717d7dc384c9b2423f3ce9adcd7935f39de3dd8c4eef9d51415c6ac90f2fbc40c575ccd7c1f6094e0371ffb04d44b96399b634fe87c4"

RPROVIDES:${PN} += "python-setools \
python3-setools \
python3.10dist(setools) \
python310-setools \
python310-setools(aarch-64) \
python3dist(setools)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libselinux.so.1()(64bit) \
libsepol.so.2()(64bit) \
python(abi) \
python3"

inherit rpm
