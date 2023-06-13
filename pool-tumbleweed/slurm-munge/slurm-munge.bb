SUMMARY = "SLURM authentication and crypto implementation using Munge"
DESCRIPTION = "This package contains the SLURM authentication module for Chris Dunlap's Munge."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-munge-23.02.2-1.1.aarch64.rpm"
RPM_HASH = "cd05e3c17cf9158070fa034ef5771073a6d785aaac41acd7885eb45f4b4203fea48a3f714b64340264bde52d8cc61ba69796b23eee6ce06e4c2574e40c4fdf9e"

RPROVIDES:${PN} += "slurm-auth-munge \
slurm-munge \
slurm-munge(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libmunge.so.2()(64bit) \
munge \
slurm-plugins"

inherit rpm
