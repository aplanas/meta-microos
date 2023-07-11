SUMMARY = "Utility That Provides Statistics Based on the Output of diff"
DESCRIPTION = "diffstat reads the output of the diff command and displays a histogram \
of the insertions, deletions, and modifications in each file."
LICENSE = "MIT"

PV = "1.65"

RPM_NAME = "diffstat-1.65-1.3.aarch64.rpm"
RPM_HASH = "8bbce0013aed11ab75ac3a3d49ddcd67e9dcd70088b6ef81f46e0b709d5fc9bad2e2bd18dd66fcf227bfba2da7b7df9a3746478d4e20e9dc70392ed67ad90ed7"

RPROVIDES:${PN} += "diffstat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
