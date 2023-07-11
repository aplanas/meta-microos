SUMMARY = "Development files for libcircllhist"
DESCRIPTION = "Development files for libcircllhist, an implementation of Circonus log-linear \
histograms written in C."
LICENSE = "BSD-3-Clause"

PV = "20180917"

RPM_NAME = "libcircllhist-devel-20180917-2.18.aarch64.rpm"
RPM_HASH = "e3b78741e4e8c74183760110b50e34f1c37bd6a84b505afda137d68947f8792fcb3d0a671d77abf1aaca61c95332713d7213702f00539f009132c22511106852"

RPROVIDES:${PN} += "libcircllhist-devel"

RDEPENDS:${PN} += "libcircllhist0-0-1"

inherit rpm
