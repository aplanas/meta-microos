SUMMARY = "Example applications for libgig"
DESCRIPTION = "Some example applications for the libgig package. \
 \
* gigdump: demo app that prints out the content of a .gig file \
* gigextract: extracts samples from a .gig file \
* dlsdump: demo app that prints out the content of a DLS file \
* rifftree: tool that prints out the RIFF tree of an arbitrary RIFF file"
LICENSE = "GPL-2.0-or-later"

PV = "4.3.0"

RPM_NAME = "libgig-tools-4.3.0-1.10.aarch64.rpm"
RPM_HASH = "d7e82c65586126cd4aea02edb004616ff6f0da97e91d1cf461fce15ac984479671c19d186f71ae0be2043dcf61f7917d3d8120fc4706025f160595c4b09afefa"

RPROVIDES:${PN} += "libgig-tools \
libgig6-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libakai.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libgig.so.10 \
libgig10 \
libsndfile.so.1 \
libstdc++.so.6"

inherit rpm
