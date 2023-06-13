SUMMARY = "Process coredump emitter using performance triggers"
DESCRIPTION = "A Linux version of the eponymous ProcDump tool from the Windows Sysinternals \
suite. It can create core dumps of processes based on performance triggers."
LICENSE = "MIT"

PV = "1.3"

RPM_NAME = "procdump-1.3-1.2.aarch64.rpm"
RPM_HASH = "93c6ed5b308aedd305033f48e0c7f3d39e5aa94be75bcc034c6f55ee091e3812854e193ff5ebf11b6150e137da7f26b62bbc9345d698f35b308897b613ab0ef7"

RPROVIDES:${PN} += "procdump \
procdump(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
