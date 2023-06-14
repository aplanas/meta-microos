SUMMARY = "Backports of the traceback module"
DESCRIPTION = "A backport of traceback to older supported Pythons."
LICENSE = "Python-2.0"

PV = "1.4.0"

RPM_NAME = "python39-traceback2-1.4.0-7.1.noarch.rpm"
RPM_HASH = "a61cd948c1237aae187ca020c6fe359718531efb1526d6a490db73a8635b1059cc255a1d81efa909270ba566c736ef9bd35c94042797b848f042c57308396675"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-traceback2 \
python39-traceback2 \
python3dist-traceback2"

RDEPENDS:${PN} += "python-abi \
python39-linecache2 \
python39-pbr"

inherit rpm
