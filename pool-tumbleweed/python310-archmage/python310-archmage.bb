SUMMARY = "A reader and decompiler for files in the CHM format"
DESCRIPTION = "arCHMage is a reader and decompiler for files in the CHM format. This is \
the format used by Microsoft HTML Help, and is also known as Compiled HTML."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.2.1"

RPM_NAME = "python310-archmage-0.4.2.1-3.3.noarch.rpm"
RPM_HASH = "3c130c105ce90f4c0a2c13f1223782e14f685a8baf55573c0dc1f2f30642b85f62cc76f4d498860f4d9fbdefd0e90d226c1f91ae7251a9d5f874bf91be7538c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-archmage \
python310-archmage \
python3dist-archmage"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-beautifulsoup4 \
python310-pychm \
python310-sgmllib3k \
update-alternatives"

inherit rpm
