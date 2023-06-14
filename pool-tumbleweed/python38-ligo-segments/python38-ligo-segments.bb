SUMMARY = "Representations of semi-open intervals"
DESCRIPTION = "ligo-segments defines the segment, segmentlist, and segmentlistdict objects for \
manipulating semi-open intervals."
LICENSE = "GPL-3.0-only"

PV = "1.4.0"

RPM_NAME = "python38-ligo-segments-1.4.0-2.1.aarch64.rpm"
RPM_HASH = "e8a8798a0c8050976939a780e38c3e6ada623a59544882f02c65de449ed464d54b3639d1aae4b6809842463ab0840ab62941a17fbea33ab4360d8551b82f4153"

RPROVIDES:${PN} += "python3.8dist-ligo-segments \
python38-ligo-segments \
python3dist-ligo-segments"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python38-six"

inherit rpm
