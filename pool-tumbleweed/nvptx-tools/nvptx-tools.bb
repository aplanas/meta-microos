SUMMARY = "PTX language tools"
DESCRIPTION = "A collection of tools for use with nvptx-none (NVIDIA Parallel Thread \
Execution) GCC toolchains. \
 \
* nvptx-none-as: 'assembler' for PTX. \
* nvptx-none-ld: 'linker' for PTX. \
* nvptx-none-run: run PTX binaries compiled with -mmainkernel. \
* nvptx-none-run-single: like nvptx-none-run, but locked, such that \
  system-wide, only one instance of it is running at a time."
LICENSE = "GPL-3.0-or-later"

PV = "1.0+git.20230122.93e0090"

RPM_NAME = "nvptx-tools-1.0+git.20230122.93e0090-1.1.aarch64.rpm"
RPM_HASH = "2fb43f5e60ed6d37b21ffc9053a24dbc0ec9e217e9c32b1dd10a387f97a0eebb35f1ba06595b6d88fb166ae44f126c4cc8d6aa8b429f34cab7f29a4b97789c23"

RPROVIDES:${PN} += "nvptx-tools"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
