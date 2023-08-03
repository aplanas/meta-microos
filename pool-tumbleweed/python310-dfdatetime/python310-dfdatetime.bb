SUMMARY = "Digital Forensics date and time (dfDateTime)"
DESCRIPTION = "dfDateTime, or Digital Forensics date and time, provides date and time \
objects to preserve accuracy and precision."
LICENSE = "Apache-2.0"

PV = "0~20230225"

RPM_NAME = "python310-dfdatetime-0~20230225-2.1.noarch.rpm"
RPM_HASH = "0c0600f27693e2c26289cfba50b409c848382bffb36cbe2970448b2d990ab5e1f1a27486b76f97c9ebb112f656e3f83745927d6fdd0c9b436cc0529c478e16be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-dfdatetime \
python310-dfdatetime \
python3dist-dfdatetime"

RDEPENDS:${PN} += "python-abi"

inherit rpm
