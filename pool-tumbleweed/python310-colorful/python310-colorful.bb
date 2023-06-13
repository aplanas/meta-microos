SUMMARY = "Terminal string styling done right, in Python"
DESCRIPTION = "colorful gives you control over terminal string styling in Python \
with an easy to use API."
LICENSE = "MIT"

PV = "0.5.5"

RPM_NAME = "python310-colorful-0.5.5-1.3.noarch.rpm"
RPM_HASH = "94e3f5f8db540fea9c0185f4feac73d3dc45bc8dcb000aab4966a65f7ee6bb093bc025ca39f11570c47bd09660bd755fdcd75ec905af9bb1d166cb50b31553ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-colorful \
python3.10dist(colorful) \
python310-colorful \
python3dist(colorful)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
