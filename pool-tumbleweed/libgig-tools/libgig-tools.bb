SUMMARY = "Example applications for libgig"
DESCRIPTION = "Some example applications for the libgig package. \
 \
* gigdump: demo app that prints out the content of a .gig file \
* gigextract: extracts samples from a .gig file \
* dlsdump: demo app that prints out the content of a DLS file \
* rifftree: tool that prints out the RIFF tree of an arbitrary RIFF file"
LICENSE = "GPL-2.0-or-later"

PV = "4.3.0"

RPM_NAME = "libgig-tools-4.3.0-1.9.aarch64.rpm"
RPM_HASH = "07bb8eb655a9519383791a1e9a3b5f11231e6bf701d03d2a1e2a447b68baa065725ff4f7f86bc4d2d9284793ad4c4f6243f19774eecd9d99faa9dae5657bfb30"

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
