SUMMARY = "Python library to provide visual text-based progress to long running operations"
DESCRIPTION = "A Python Progressbar library to provide visual (yet text based) progress to long running operations."
LICENSE = "BSD-3-Clause"

PV = "4.2.0"

RPM_NAME = "python311-progressbar2-4.2.0-2.4.noarch.rpm"
RPM_HASH = "4159c26562ac8cf94ccd7a60da1251bb62869083a153ee445ba45ffa54363ac1cce25ee5576562f78d47e4ecca4fb1aae0c1b5d13f7582bdba3d16efc8608ffb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-progressbar2 \
python3.11dist-progressbar2 \
python311-progressbar2 \
python3dist-progressbar2"

RDEPENDS:${PN} += "python-abi \
python311-python-utils"

inherit rpm
