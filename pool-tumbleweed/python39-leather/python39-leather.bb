SUMMARY = "Python charting for 80% of humans"
DESCRIPTION = "Leather is the Python charting library for those who need charts *now* \
and don't care if they're perfect."
LICENSE = "MIT"

PV = "0.3.4"

RPM_NAME = "python39-leather-0.3.4-2.1.noarch.rpm"
RPM_HASH = "756ec6fb95180f503e789e68453c690801c5c0159154b02d04ccdd33d02e9fccbe8a96dcf7663a508493f2e2b3201cc0acad7b727f2da13c04f10365a5adbbe5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(leather) \
python39-leather \
python3dist(leather)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
