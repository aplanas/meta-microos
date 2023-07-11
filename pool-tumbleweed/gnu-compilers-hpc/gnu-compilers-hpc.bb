SUMMARY = "SUSE HPC GNU Compiler Toolchain environment"
DESCRIPTION = "Provides HPC-compatible setup and configuration for the GNU compiler toolchain."
LICENSE = "BSD-3-Clause"

PV = "1.4"

RPM_NAME = "gnu-compilers-hpc-1.4-13.1.noarch.rpm"
RPM_HASH = "2447b9b33537b1f933dc52b83b6462cc1522d1e294ba32f8bcecc587057ff6ca0432565798e6e12f55c8cec26063ce02717967552a08fbef306e7b66f406a926"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnu-compilers-hpc \
gnu13-compilers-hpc"

RDEPENDS:${PN} += "lua-lmod"

inherit rpm
