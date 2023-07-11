SUMMARY = "Include Files mandatory for Development of bash loadable builtins"
DESCRIPTION = "This package contains the C header files for writing loadable new \
builtins for the interpreter Bash. Use the output of the command \
`pkg-config bash --cflags' on the compilers command line."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.15"

RPM_NAME = "bash-devel-5.2.15-8.6.aarch64.rpm"
RPM_HASH = "b9fa3836d959913259d8e7e66861713bf6d53b49ec998f5a1b47d67a11eed3b8981198063162981b0460d6b3ab1085b63bb41ed9bdba3a7e81d11d95861caafc"

RPROVIDES:${PN} += "bash-devel \
pkgconfig-bash"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
