SUMMARY = "Utilities for Persistent Memory"
DESCRIPTION = "The Persistent Memory Development Kit (PMDK) is a collection of \
libraries and tools built on the DAX (Direct Access) feature of the \
Linux kernel which allows applications to access persistent memory as \
memory-mapped files, as described in the SNIA NVM Programming Model. \
 \
* pmempool: utility for administration and diagnosis  of PMDK pools \
* pmreorder: Python scripts to parse and replay operations logged by pmemcheck \
* daxio: utility to perform I/O on DAX devices"
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "pmdk-tools-1.11.1-1.9.aarch64.rpm"
RPM_HASH = "9a17783a45f540f9560362b644877c1120f307d068a03f743f314d8479a9b908f65ecd569fbf06a52de578245a9bade28e8b4eb347330b84a9212e82308fb731"

RPROVIDES:${PN} += "nvml-tools \
pmdk-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
bash-completion \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdaxctl.so.1 \
libndctl.so.6 \
libpmem.so.1 \
libpmemblk.so.1 \
libpmemlog.so.1 \
libpmemobj.so.1 \
libpmempool.so.1"

inherit rpm
