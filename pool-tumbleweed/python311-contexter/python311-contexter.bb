SUMMARY = "A replacement of the contextlib module"
DESCRIPTION = "Contexter is a full replacement of the contextlib standard library \
module."
LICENSE = "MIT"

PV = "0.1.4"

RPM_NAME = "python311-contexter-0.1.4-2.14.noarch.rpm"
RPM_HASH = "f6640861822f78189b29997dbbb806afe42a51cd7a18505f87bb66bfc5b9e181287e1a8549d7f95c685641470650b3af913cd3f2d486699b0d55a2daeaf1f912"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-contexter \
python311-contexter \
python3dist-contexter"

RDEPENDS:${PN} += "python-abi"

inherit rpm
