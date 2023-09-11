SUMMARY = "SUSE HPC GNU Compiler Toolchain environment"
DESCRIPTION = "Provides HPC-compatible setup and configuration for the GNU compiler toolchain."
LICENSE = "BSD-3-Clause"

PV = "1.4"

RPM_NAME = "gnu-compilers-hpc-1.4-14.1.noarch.rpm"
RPM_HASH = "eba34da14130a0ece4242aeb85cc9776cc8e35e4f4ba5f53b35d1361e1b4e3a07fc512799f240070380c0bd62660ddd3980b1157c6b97a0dd2d2b4df7c06730e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnu-compilers-hpc \
gnu13-compilers-hpc"

RDEPENDS:${PN} += "lua-lmod"

inherit rpm
