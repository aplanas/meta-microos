SUMMARY = "Widget to display the current color temperature of redshift"
DESCRIPTION = "Displays the current color temperature of redshift. Takes no parameters."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-redshift-2.1.5-3.3.noarch.rpm"
RPM_HASH = "045c091c96e850348b9ee04fa29412961ce30b30def8526b40108f07661cb20df6456f9029ebab91706cd659e7f3b07c95e2e1d909aed3ee43df33af4afc1d6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-redshift"
RDEPENDS:${PN} += "bumblebee-status redshift"

inherit rpm
