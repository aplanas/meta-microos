SUMMARY = "Python tools for handling intervals"
DESCRIPTION = "Python tools for handling intervals (ranges of comparable objects)."
LICENSE = "BSD-3-Clause"

PV = "0.9.2"

RPM_NAME = "python310-intervals-0.9.2-1.7.noarch.rpm"
RPM_HASH = "e258ec65f8faed47cc07317dcead293d56da7bc218b0e9d28309b992a10634d9491f05129574dddda9772acdca6c4ad6b5512c3a213a9bedac9372f566e589bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-intervals \
python310-intervals \
python3dist-intervals"

RDEPENDS:${PN} += "python-abi \
python310-infinity"

inherit rpm
