SUMMARY = "Viewer for Structured Fax Files (.sff) used by ISDN applications"
DESCRIPTION = "The CAPI interface for programming ISDN hardware expects and gives you \
faxes in the 'Structured Fax File' (SFF) format. \
 \
SffView is a viewer for SFF files. SffView is written in C++ using the \
wxWidgets toolkit."
LICENSE = "MIT"

PV = "0.5"

RPM_NAME = "sffview-0.5-3.4.aarch64.rpm"
RPM_HASH = "86ed6276dc2045406904f80f1b513cdc55021d8a4eea5aeb9def9ab6d0055f0e65511b1684f7bb9438182f2cd8b04a66002a8b898f79e2cfd3e37512fb5fbcfc"

RPROVIDES:${PN} += "sffview"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwx-baseu-suse.so.3.0.5 \
libwx-gtk2u-core-suse.so.3.0.5"

inherit rpm
