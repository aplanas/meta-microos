SUMMARY = "Header files for the SPOOLES library"
DESCRIPTION = "spooles-openmpi1-devel provides the header file for the SPOOLES library."
LICENSE = "BSD-2-Clause & SUSE-Public-Domain"

PV = "2.2"

RPM_NAME = "spooles-openmpi1-devel-2.2-1.4.aarch64.rpm"
RPM_HASH = "66c4e915df3691bbf7f32d74dbe835a2c29738c2ed50153ef039d95b15451f27315b3530121e31899d2902b8f9cb0dcb45c06f6d5b8970eb103884481fa9d346"

RPROVIDES:${PN} += "spooles-openmpi1-devel"

RDEPENDS:${PN} += "libspooles2-2-openmpi1"

inherit rpm
