SUMMARY = "Safe netrc file parser"
DESCRIPTION = "This package provides a subclass of the Python standard library netrc.netrc \
class to add some custom behaviors."
LICENSE = "GPL-2.0+"

PV = "1.0.0"

RPM_NAME = "python39-safe-netrc-1.0.0-1.6.noarch.rpm"
RPM_HASH = "acd1a0c5ebadf57a5d378a02abff31026dbd1b9c64cc289f0b8cb4a20b77498131ff09ae02ecf1ef02dd6815b40ede9112d511936b3f791bdf7d760127572c4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-safe-netrc \
python39-safe-netrc \
python3dist-safe-netrc"

RDEPENDS:${PN} += "python-abi"

inherit rpm
