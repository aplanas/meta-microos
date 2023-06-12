SUMMARY = "A reader and decompiler for files in the CHM format"
DESCRIPTION = "arCHMage is a reader and decompiler for files in the CHM format. This is \
the format used by Microsoft HTML Help, and is also known as Compiled HTML."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.2.1"

RPM_NAME = "python39-archmage-0.4.2.1-3.1.noarch.rpm"
RPM_HASH = "1fc750e2ed5bb9da1a85de467154303a2d5376c0724ab5ca786393e9a48f492965aa7b5877f8b73cab1f5fdd9c77869164015560a352065a6eeb5d633ca71d40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(archmage) \
python39-archmage \
python3dist(archmage)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-beautifulsoup4 \
python39-pychm \
python39-sgmllib3k \
update-alternatives"

inherit rpm
