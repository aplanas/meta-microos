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

RPM_NAME = "nvptx-tools-1.0+git.20230122.93e0090-1.2.aarch64.rpm"
RPM_HASH = "5c8f6da3c63e818be1504b6a203f840ec4043a96ffe21b967248078891b5d7dd21bb83c21713b1ff04b454b816d828bfeab4cbc2bc7e4515680ae78296d5cf29"

RPROVIDES:${PN} += "nvptx-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
