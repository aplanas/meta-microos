SUMMARY = "Terminal string styling done right, in Python"
DESCRIPTION = "colorful gives you control over terminal string styling in Python \
with an easy to use API."
LICENSE = "MIT"

PV = "0.5.5"

RPM_NAME = "python310-colorful-0.5.5-1.5.noarch.rpm"
RPM_HASH = "fe48e444e924a5bcd4a3593a735d1b7c3c550e1587f799504e7b220fd4cb2556d5372154e37c8c5760eab2393542e7702f4b3585121c245b1c09e076cd741959"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-colorful \
python310-colorful \
python3dist-colorful"

RDEPENDS:${PN} += "python-abi"

inherit rpm
