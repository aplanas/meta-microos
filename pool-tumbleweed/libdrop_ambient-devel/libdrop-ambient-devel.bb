SUMMARY = "Devel package for libdrop_ambient0"
DESCRIPTION = "This package contains the files needed for developing \
applications that need to use the libdrop_ambient library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.3"

RPM_NAME = "libdrop_ambient-devel-0.8.3-2.1.aarch64.rpm"
RPM_HASH = "5ae617bf005e1502b1281079e19a9cce19a67c772dfaf2756d2a972409f0aab55169dea454aaa409dfcae71c9a76cc6d8ecd1d97709aa2ecea8e075aac5988d8"

RPROVIDES:${PN} += "libdrop-ambient-devel"

RDEPENDS:${PN} += "libdrop-ambient0"

inherit rpm
