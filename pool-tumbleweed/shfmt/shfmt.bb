SUMMARY = "A shell parser, formatter, and interpreter with bash support; includes shfmt"
DESCRIPTION = "A shell parser, formatter, and interpreter. Supports POSIX Shell, Bash, and mksh."
LICENSE = "BSD-3-Clause"

PV = "3.5.1"

RPM_NAME = "shfmt-3.5.1-1.7.aarch64.rpm"
RPM_HASH = "20d4af4dda389443107bc82e98d13178a4040e66b797993fc83dbdb54b805f85ce28bf3d8b4110a864ab3b4c386cca8832ee892556cbb54f20369caf8c6b211c"

RPROVIDES:${PN} += "shfmt"

RDEPENDS:${PN} += ""

inherit rpm
