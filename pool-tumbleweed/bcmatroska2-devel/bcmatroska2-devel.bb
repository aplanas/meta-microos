SUMMARY = "Development files for bcmatroska2"
DESCRIPTION = "This package includes the files necessary for compiling and linking \
applications which will use libbcmatroska2."
LICENSE = "BSD-3-Clause & Zlib & GPL-2.0-or-later"

PV = "5.2.1"

RPM_NAME = "bcmatroska2-devel-5.2.1-1.3.aarch64.rpm"
RPM_HASH = "16641e635b4b5e649004d5afc81c3f1c6aba7b7cfe908046e7ab03d856cc6705677ce710790599f844d4225378bfd84b33d3490ba87c0370956feb45e16094cc"

RPROVIDES:${PN} += "bcmatroska2-devel \
bcmatroska2-devel(aarch-64)"

RDEPENDS:${PN} += "libbcmatroska2-0"

inherit rpm
