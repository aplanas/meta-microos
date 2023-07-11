SUMMARY = "Fully-threaded I/O benchmark program"
DESCRIPTION = "A simple multithreaded I/O benchmark, popular amongst kernel developers. \
The results tend to be realistic enough to have some bearing on real \
world results, while the tests are simple enough for kernel engineers to \
analyze changes ..."
LICENSE = "GPL-2.0-only"

PV = "0.4.1"

RPM_NAME = "tiobench-0.4.1-4.10.aarch64.rpm"
RPM_HASH = "53e4fc638fb5bb5db41391ddf1fc09265b33936572066f7847431c91b474c9a8b69d774575e734c018ddc78a4d016de9c4eda47d179713b70c762928d3bb6c5f"

RPROVIDES:${PN} += "tiobench"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
