SUMMARY = "Persistent Memory Development Kit"
DESCRIPTION = "The Persistent Memory Development Kit (PMDK), formerly known as NVML \
(Non-Volatile Memory Library), is a collection of libraries and tools \
built on the DAX (Direct Access) feature of the Linux kernel which \
allows applications to access persistent memory as memory-mapped \
files, as described in the SNIA NVM Programming Model."
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "pmdk-1.11.1-1.9.aarch64.rpm"
RPM_HASH = "a22d278a4c3ca15714784251475122867a52dbeadd5a52fbb256cc84b74e7be5fb2681f67ce54be7c72e034c86531ce7971020eabfa12af0229c9aea22078ddb"

RPROVIDES:${PN} += "nvml \
pmdk"

RDEPENDS:${PN} += ""

inherit rpm
