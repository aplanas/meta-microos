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

PV = "1.0+git.20230718.bbb6fe6"

RPM_NAME = "nvptx-tools-1.0+git.20230718.bbb6fe6-1.1.aarch64.rpm"
RPM_HASH = "3e87f85c1ec2d333b3dbe706f05eeb04f9329291eef555b7f9f0c65b369d2df019cac7226f3ec5d267bfcaf85aff27d5c72b4131cdcae51d3c67f0fe82582896"

RPROVIDES:${PN} += "nvptx-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
