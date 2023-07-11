SUMMARY = "Data files for libsigrok"
DESCRIPTION = "libsigrok is a shared library written in C which provides the basic API \
for talking to logic analyzer hardware and reading/writing the acquired data \
into various input/output file formats."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.2"

RPM_NAME = "libsigrok-data-0.5.2-4.13.noarch.rpm"
RPM_HASH = "7f4865e357896fe0551d1ae26b44d1e47740cc4b4b8d8ba71f329366399b68b5f15d715cf19e01ee6cfe25db54647810672398e7832e2ace6e6d0c7efd114465"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libsigrok-data"

RDEPENDS:${PN} += "hicolor-icon-theme \
shared-mime-info"

inherit rpm
