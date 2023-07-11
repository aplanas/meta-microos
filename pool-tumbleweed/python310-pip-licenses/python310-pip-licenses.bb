SUMMARY = "Python packages license list"
DESCRIPTION = "Dump the software license list of Python packages installed with pip."
LICENSE = "MIT"

PV = "4.3.2"

RPM_NAME = "python310-pip-licenses-4.3.2-1.3.noarch.rpm"
RPM_HASH = "39e12abaaccdc41364b88bde90316390f3f41cdeedc7eb5577e3fd4d21f1fd0a31251c2dbeef4621cfb6ab562abf4426f8225b3b97950b5e333fb8647a38b44d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pip-licenses \
python310-pip-licenses \
python3dist-pip-licenses"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-PrettyTable \
python310-pip \
update-alternatives"

inherit rpm
