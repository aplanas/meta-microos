SUMMARY = "Preconfigure Python global environment to run scripts within"
DESCRIPTION = "Set up Python global environment using a wrapper script, and \
then run another script within that environment, ala pdb, profile, etc."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python39-main-wrapper-0.1.1-1.6.noarch.rpm"
RPM_HASH = "7ec01b1f1e5030fbfbfada9b0492734563e4472d3d203324b89121fbef057bd1fcc9f69c54d8d4ff59760671d967fd828b85583f56131a67feab7e997ffd2d6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-main-wrapper \
python39-main-wrapper \
python3dist-main-wrapper"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-base \
python39-six \
update-alternatives"

inherit rpm
