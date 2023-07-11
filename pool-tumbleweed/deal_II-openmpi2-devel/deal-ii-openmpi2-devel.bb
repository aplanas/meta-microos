SUMMARY = "Development files for dealii-openmpi2"
DESCRIPTION = "The dealii-openmpi2-devel package contains libraries and header files for \
developing applications that use dealii-openmpi2."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.2"

RPM_NAME = "deal_II-openmpi2-devel-9.4.2-1.5.aarch64.rpm"
RPM_HASH = "69c6ceb60c8a09dc3a3092faed5c2f0d4c10ebab38845a280dba035f506234c52a4bbce439e5efe26c15a7e54d553eec862cc510e899c5723aaf480f935b0536"

RPROVIDES:${PN} += "deal-II-openmpi2-devel \
dealii-openmpi2-openmpi2-devel"

RDEPENDS:${PN} += "libdeal-II9-4-2-openmpi2"

inherit rpm
