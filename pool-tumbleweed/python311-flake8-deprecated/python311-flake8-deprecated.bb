SUMMARY = "Flake8 deprecations plugin"
DESCRIPTION = "This flake8 plugin helps you keeping up with method deprecations and giving hints about what \
they should be replaced with."
LICENSE = "GPL-2.0-only"

PV = "2.0.1"

RPM_NAME = "python311-flake8-deprecated-2.0.1-1.3.noarch.rpm"
RPM_HASH = "207b97501b552768750b0bff4f6757735eae056f3de7ec71acdecc7e21836aa21a5406d6e09b64c69d05eb4a949e2024415b0b99241d5645ac12a8e63f1258b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(flake8-deprecated) \
python311-flake8-deprecated \
python3dist(flake8-deprecated)"
RDEPENDS:${PN} += "python(abi) \
python311-flake8"

inherit rpm
