SUMMARY = "Cubic-to-quadratic bezier curve conversion"
DESCRIPTION = "Cubic-to-quadratic bezier curve conversion"
LICENSE = "Apache-2.0"

PV = "1.6.7.post2"

RPM_NAME = "python310-cu2qu-1.6.7.post2-1.4.aarch64.rpm"
RPM_HASH = "6bb5d1d5ab19e7928b94c49829c1915c8500f303fdec45a3bc17fe41150696a1bbb4d9f7c8a49838cb5ac679feb616e9ebc9e1120c417a3bf79da59389b92439"

RPROVIDES:${PN} += "python3-cu2qu \
python3.10dist(cu2qu) \
python310-cu2qu \
python310-cu2qu(aarch-64) \
python3dist(cu2qu)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-FontTools"

inherit rpm
