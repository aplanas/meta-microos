SUMMARY = "AWS authentication for Amazon S3 for the python requests module"
DESCRIPTION = "AWS authentication for Amazon S3 for the Python 'requests' library. \
It is made to work with Python 2.7 and 3. \
At the moment, only S3 is supported."
LICENSE = "BSD-3-Clause"

PV = "0.1.8"

RPM_NAME = "python310-requests-aws-0.1.8-3.11.noarch.rpm"
RPM_HASH = "c94ccda21e4db78513fa83ba1e2322cd2f09268b48ae002d326a6a663f46a87400f2bee2518a63bb75920add4d80af9a5b9973ddd67a085365ad82acd9f94d3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requests-aws \
python3.10dist(requests-aws) \
python310-requests-aws \
python3dist(requests-aws)"
RDEPENDS:${PN} += "python(abi) \
python310-requests"

inherit rpm
