SUMMARY = "Data files for Zlibrary"
DESCRIPTION = "This package contains data files for Zlibrary."
LICENSE = "GPL-2.0+"

PV = "0.99.4"

RPM_NAME = "zlibrary-data-0.99.4-3.28.noarch.rpm"
RPM_HASH = "45335d5374011775c8a7585afecc4e9fccc46091c458e7d612b37e192db10ce2efba0d39569f28b96d0368eb63f477630daa8ce272ad60ea5167d25208a5914f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zlibrary-data"

RDEPENDS:${PN} += ""

inherit rpm
