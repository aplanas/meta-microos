SUMMARY = "Run multiple jobs at once"
DESCRIPTION = "parallel [options] [command]-- [argument ...] \
 \
parallel runs the specified command, passing it a single one of the specified arguments. \
This is repeated for each argument. Jobs may be run in parallel. The default is to run one job per CPU."
LICENSE = "GPL-2.0-only"

PV = "0.67"

RPM_NAME = "moreutils-parallel-0.67-2.3.aarch64.rpm"
RPM_HASH = "6f205c9fdaf34361bec973a84ae4797db92262334e67dc7431df353924b6a83089f41e14a41a014e623ffa43836b3b56e84ef5fb34a52e0236132a4e6d099dfc"

RPROVIDES:${PN} += "moreutils-parallel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
