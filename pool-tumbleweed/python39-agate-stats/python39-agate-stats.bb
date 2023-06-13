SUMMARY = "Additional statistical methods for agate"
DESCRIPTION = "Agate-stats adds statistical methods to agate."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python39-agate-stats-0.4.0-3.2.noarch.rpm"
RPM_HASH = "c5e570ec4a39af7a143ff8293ba8a753d8618a6c289760f8040a5eb4876b72e7e951838cdf138ef030ea8e667293eba14dcecdcb43ba04ff8f2559678d47778a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(agate-stats) \
python39-agate-stats \
python3dist(agate-stats)"

RDEPENDS:${PN} += "python(abi) \
python39-agate \
python39-six"

inherit rpm
