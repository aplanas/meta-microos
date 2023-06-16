SUMMARY = "A library to disable fsync calls"
DESCRIPTION = "libeatmydata is a small LD_PRELOAD library designed to (transparently) \
disable fsync (and friends, like open(O_SYNC)). This has two side-effects: \
making software that writes data safely to disk a lot quicker and making \
this software no longer crash safe."
LICENSE = "GPL-3.0-only"

PV = "130"

RPM_NAME = "eatmydata-130-1.6.aarch64.rpm"
RPM_HASH = "8a2349cde099b4076edfc1ec28a58d8869450274af761f5c6a187ab57dc34e1ce54441ee4f739afd07b38203980e829533f09ff0d32129811c788418d16fa5b6"

RPROVIDES:${PN} += "eatmydata \
libeatmydata.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
