SUMMARY = "Python sunset and sunrise time calculation"
DESCRIPTION = "Python sunset and sunrise time calculation library."
LICENSE = "LGPL-3.0-only"

PV = "1.2.5"

RPM_NAME = "python311-suntime-1.2.5-1.16.noarch.rpm"
RPM_HASH = "02fbce5dea0252e0fa764c999c6fdefc6e5081e0fac62cea64bd21dc80ce0fe424f4638e4de36d363257ee6d0ad0ff58b0d9cc8b7f245a7498c8b9f8ca5913fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-suntime \
python3.11dist-suntime \
python311-suntime \
python3dist-suntime"

RDEPENDS:${PN} += "python-abi \
python311-python-dateutil"

inherit rpm
