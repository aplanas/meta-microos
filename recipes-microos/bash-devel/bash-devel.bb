SUMMARY = "Include Files mandatory for Development of bash loadable builtins"
DESCRIPTION = "This package contains the C header files for writing loadable new \
builtins for the interpreter Bash. Use the output of the command \
`pkg-config bash --cflags' on the compilers command line."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.15"

RPM_NAME = "bash-devel-5.2.15-8.3.aarch64.rpm"
RPM_HASH = "98394a3d095e421e361948ac2892ffc883ea985152af821eaa6e09c3a6a86fc0936a365bc16bd27c8c852310669b677653207eba70854871a45f2ce4004781cf"

RPROVIDES:${PN} += "bash-devel bash-devel(aarch-64) pkgconfig(bash)"
RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
