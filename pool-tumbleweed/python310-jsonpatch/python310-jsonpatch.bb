SUMMARY = "Python - JSON-Patches"
DESCRIPTION = "Python module to apply JSON-Patches (according to RFC 6902)."
LICENSE = "BSD-3-Clause"

PV = "1.32"

RPM_NAME = "python310-jsonpatch-1.32-4.1.noarch.rpm"
RPM_HASH = "44dc0cc99115d56aa261d0aa58bc11234417717cfef9e31676203595bffd36e59e56c13255f04e51967ab24d7ae4580979ac1658934497118ebe93568e57882e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsonpatch \
python3.10dist(jsonpatch) \
python310-jsonpatch \
python3dist(jsonpatch)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
alts \
python(abi) \
python310-jsonpointer"

inherit rpm
