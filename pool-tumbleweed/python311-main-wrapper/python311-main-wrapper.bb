SUMMARY = "Preconfigure Python global environment to run scripts within"
DESCRIPTION = "Set up Python global environment using a wrapper script, and \
then run another script within that environment, ala pdb, profile, etc."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python311-main-wrapper-0.1.1-1.4.noarch.rpm"
RPM_HASH = "dac93c0158e628518d9fcbfe338286536cead7bed14b4519a7faa7047f02a49e50a3952ecb8e490d12906a838af2001833e98f098e468b95f3074a9bf296d6c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(main-wrapper) \
python311-main-wrapper \
python3dist(main-wrapper)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-base \
python311-six \
update-alternatives"

inherit rpm
