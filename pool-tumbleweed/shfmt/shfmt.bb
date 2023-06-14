SUMMARY = "A shell parser, formatter, and interpreter with bash support; includes shfmt"
DESCRIPTION = "A shell parser, formatter, and interpreter. Supports POSIX Shell, Bash, and mksh."
LICENSE = "BSD-3-Clause"

PV = "3.5.1"

RPM_NAME = "shfmt-3.5.1-1.6.aarch64.rpm"
RPM_HASH = "369d427266b96d98137982556f49b2e064e2d4eb5569f21896bbda17727845f8bb1f7c5ca33054fd1d40d010dc7c58ae4102d35f8bb58d78ed0099818406afdb"

RPROVIDES:${PN} += "shfmt"

RDEPENDS:${PN} += ""

inherit rpm
