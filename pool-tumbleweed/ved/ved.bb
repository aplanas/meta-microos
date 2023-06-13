SUMMARY = "The Visual Editor"
DESCRIPTION = "Ved (visual editor) is a screen-oriented editor that implements a \
user interface somewhere between vi and emacs. It has almost no \
limitations on file size and supports to edit large files (files >2 \
GB)."
LICENSE = "CDDL-1.0"

PV = "1.8"

RPM_NAME = "ved-1.8-47.3.aarch64.rpm"
RPM_HASH = "d31f8abc9149e5922919c2b5d09de12a817d4b5fb2a151ef9c84dc3601f8d80b610f1e138dbfc31fa669c1644137802430595d0f6d73ea0892cef4dcb9393cd8"

RPROVIDES:${PN} += "ved \
ved(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libschily.so.2.0()(64bit) \
libschily.so.2.0(SCHILY_1.0)(64bit) \
libschily.so.2.0(SCHILY_1.10)(64bit) \
libschily.so.2.0(SCHILY_1.2)(64bit) \
libschily.so.2.0(SCHILY_1.5)(64bit) \
libschily.so.2.0(SCHILY_2.0)(64bit) \
libxtermcap.so.1.0()(64bit) \
libxtermcap.so.1.0(SCHILY_1.0)(64bit) \
libxtermcap.so.1.0(SCHILY_1.1)(64bit)"

inherit rpm
