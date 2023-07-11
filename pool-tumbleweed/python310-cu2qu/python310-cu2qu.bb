SUMMARY = "Cubic-to-quadratic bezier curve conversion"
DESCRIPTION = "Cubic-to-quadratic bezier curve conversion"
LICENSE = "Apache-2.0"

PV = "1.6.7.post2"

RPM_NAME = "python310-cu2qu-1.6.7.post2-1.6.aarch64.rpm"
RPM_HASH = "094ec95b3012c4c56707c4c97d9ee342454925cbe58d6fe582a6323268a101fb81a23adcbda5df83572b34503cbe3a06d893a6dfafd3229e856812c5414de25f"

RPROVIDES:${PN} += "python3.10dist-cu2qu \
python310-cu2qu \
python3dist-cu2qu"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-FontTools"

inherit rpm
