SUMMARY = "Tools to manage UEFI variables"
DESCRIPTION = "efivar provides a simple command line interface to the UEFI variable facility."
LICENSE = "LGPL-2.1-only"

PV = "38"

RPM_NAME = "efivar-38-1.4.aarch64.rpm"
RPM_HASH = "bf6d7d231f07bd5fb1765b56b427a1ce8756b1d04c0c90196e0bd8bcdd4408102c6b2d288a8a4676f70cdbe20e00b30b4e8742e94852479ccf5677319effcefe"

RPROVIDES:${PN} += "efivar"

RDEPENDS:${PN} += "libc.so.6 \
libefisec.so.1 \
libefivar.so.1 \
libefivar1"

inherit rpm
