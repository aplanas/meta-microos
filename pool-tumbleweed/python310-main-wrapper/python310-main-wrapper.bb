SUMMARY = "Preconfigure Python global environment to run scripts within"
DESCRIPTION = "Set up Python global environment using a wrapper script, and \
then run another script within that environment, ala pdb, profile, etc."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python310-main-wrapper-0.1.1-1.6.noarch.rpm"
RPM_HASH = "1a651cef64c36ee169f49a8200884bcfdf9cbefa7d4b9ba5b8c1f76a8038ad44103571aea02742f968e9bdd56826b9a4ea0c2e383dd48d8a18f6e40747b8b342"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-main-wrapper \
python310-main-wrapper \
python3dist-main-wrapper"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-base \
python310-six \
update-alternatives"

inherit rpm
