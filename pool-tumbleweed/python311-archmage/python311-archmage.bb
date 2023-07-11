SUMMARY = "A reader and decompiler for files in the CHM format"
DESCRIPTION = "arCHMage is a reader and decompiler for files in the CHM format. This is \
the format used by Microsoft HTML Help, and is also known as Compiled HTML."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.2.1"

RPM_NAME = "python311-archmage-0.4.2.1-3.3.noarch.rpm"
RPM_HASH = "aa5d5a581305df9a422a058999f0afb233acc52e5b04f2b04a748e7fab624e24d6a48e40059608c5955406f1e841bdf427723c43bf6c6bf8c37afb0e675fdf55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-archmage \
python3.11dist-archmage \
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
