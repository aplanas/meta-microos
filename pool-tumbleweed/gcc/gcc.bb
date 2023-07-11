SUMMARY = "The system GNU C Compiler"
DESCRIPTION = "The system GNU C Compiler."
LICENSE = "GPL-3.0-or-later"

PV = "13"

RPM_NAME = "gcc-13-1.5.aarch64.rpm"
RPM_HASH = "da532ef04254685d8a0e1fc2a841259e5cbf8d8411799a40793ff3a179cee4e7728faa5130d4bc2a34ea14a7549640722044e8967a73ceb137a15b8c881a3920"

RPROVIDES:${PN} += "c-compiler \
gcc"

RDEPENDS:${PN} += "cpp \
gcc13"

inherit rpm
