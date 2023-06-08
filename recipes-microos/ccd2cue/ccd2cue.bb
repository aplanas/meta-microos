SUMMARY = "CCD sheet to CUE sheet converter"
DESCRIPTION = "GNU ccd2cue is a CCD sheet to CUE sheet converter.  It supports the full \
extent of CUE sheet format expressiveness, including mixed-mode discs \
and CD-Text meta-data."
LICENSE = "GPL-3.0+ & GFDL-1.3"

PV = "0.5"

RPM_NAME = "ccd2cue-0.5-2.23.aarch64.rpm"
RPM_HASH = "33585392974abf6072215da60fbc9be71ce720e10a45f0695efcea007d5bf892f4ac54a9162633313c11e2f2788c4e9516805f5bca81dfb14d48965a7e6f0ff0"

RPROVIDES:${PN} += "ccd2cue ccd2cue(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
