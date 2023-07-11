SUMMARY = "Python tools for handling intervals"
DESCRIPTION = "Python tools for handling intervals (ranges of comparable objects)."
LICENSE = "BSD-3-Clause"

PV = "0.9.2"

RPM_NAME = "python311-intervals-0.9.2-1.7.noarch.rpm"
RPM_HASH = "1477b7a809dc833bde7ad4a128c405bef66c0bc6ee9b05a66e80b3d992c86e20acd38c4c210066d4957c959f2aa93d8678548455cf869b10a646db5d184ab53d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-intervals \
python3.11dist-intervals \
python311-intervals \
python3dist-intervals"

RDEPENDS:${PN} += "python-abi \
python311-infinity"

inherit rpm
