SUMMARY = "Simple library for merging two strings with respect to a base one"
DESCRIPTION = "Simple Python library to perform a 3-way merge between strings, based on \
diff-match-patch. This library performs merges at a character level, as \
opposed to most VCS systems, which opt for a line-based approach."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python311-three-merge-0.1.1-1.11.noarch.rpm"
RPM_HASH = "73f1c0ba41fd645c34f4170c93f6cb3ea7873feddfc8cc867be84f370007e6ec72d7e5c9016edca58f6113816a57580afe9b5599b8b7619cff3c315e557c9f1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-three-merge \
python311-three-merge \
python3dist-three-merge"

RDEPENDS:${PN} += "python-abi \
python311-diff-match-patch"

inherit rpm
