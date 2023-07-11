SUMMARY = "Python module that identifies Chinese text as Simplified or Traditional"
DESCRIPTION = "Python module that identifies Chinese text as Simplified or Traditional."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-hanzidentifier-1.1.0-2.3.noarch.rpm"
RPM_HASH = "38f0306ab89a239336623294e4845cd9ba2d65d3efd2f1c5111913920a46d48d5ca2924620203bd8dfd555c235dcfc5aacaeef8eeeee5858c27fd0947626f610"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hanzidentifier \
python3.11dist-hanzidentifier \
python311-hanzidentifier \
python3dist-hanzidentifier"

RDEPENDS:${PN} += "python-abi \
python311-zhon"

inherit rpm
