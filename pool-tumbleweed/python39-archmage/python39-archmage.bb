SUMMARY = "A reader and decompiler for files in the CHM format"
DESCRIPTION = "arCHMage is a reader and decompiler for files in the CHM format. This is \
the format used by Microsoft HTML Help, and is also known as Compiled HTML."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.2.1"

RPM_NAME = "python39-archmage-0.4.2.1-3.3.noarch.rpm"
RPM_HASH = "0014f83312a7203a4eb8aabf683fb08ddea22562f18ba003db96ea47884d7b6b66f7154feac2679ac7e1ace2b3a19abda5f1b855b6b43134bac327788298954d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-archmage \
python39-archmage \
python3dist-archmage"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-beautifulsoup4 \
python39-pychm \
python39-sgmllib3k \
update-alternatives"

inherit rpm
