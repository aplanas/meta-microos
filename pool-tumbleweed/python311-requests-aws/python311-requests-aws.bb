SUMMARY = "AWS authentication for Amazon S3 for the python requests module"
DESCRIPTION = "AWS authentication for Amazon S3 for the Python 'requests' library. \
It is made to work with Python 2.7 and 3. \
At the moment, only S3 is supported."
LICENSE = "BSD-3-Clause"

PV = "0.1.8"

RPM_NAME = "python311-requests-aws-0.1.8-3.13.noarch.rpm"
RPM_HASH = "33a614f93e89a5a526548b2569c2d6d934e26487440ebb3bd0b7b4a81638f8ffe9d64477e46aaacd69a7cbf846a871a8fbd717e6e056bf7db254ab1c37912366"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requests-aws \
python3.11dist-requests-aws \
python311-requests-aws \
python3dist-requests-aws"

RDEPENDS:${PN} += "python-abi \
python311-requests"

inherit rpm
