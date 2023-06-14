SUMMARY = "A Command-Line Interface framework"
DESCRIPTION = "A Command-Line Interface framework"
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "python310-knack-0.10.1-1.3.noarch.rpm"
RPM_HASH = "626431749525bcc3574d336e5d1bdb1862559cc918d0c89225a5af84f2b58befcd90f9495a913d72b6428963a991e70814ea6923b1f832968a32d60c66ff7551"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-knack \
python3.10dist-knack \
python310-knack \
python3dist-knack"

RDEPENDS:${PN} += "python-abi \
python310-PyYAML \
python310-argcomplete \
python310-jmespath \
python310-pygments \
python310-tabulate"

inherit rpm
