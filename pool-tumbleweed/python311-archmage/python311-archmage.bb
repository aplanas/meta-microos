SUMMARY = "A reader and decompiler for files in the CHM format"
DESCRIPTION = "arCHMage is a reader and decompiler for files in the CHM format. This is \
the format used by Microsoft HTML Help, and is also known as Compiled HTML."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.2.1"

RPM_NAME = "python311-archmage-0.4.2.1-3.1.noarch.rpm"
RPM_HASH = "c60ca8e3f9755ee9649c72364fbe45b76a95d4ec2901c3731b8b640e48852576fad75bb96669b80c7423d2b1fd37316de37ee5a296c24fba8b492f1f59a80205"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-archmage \
python311-archmage \
python3dist-archmage"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-beautifulsoup4 \
python311-pychm \
python311-sgmllib3k \
update-alternatives"

inherit rpm
