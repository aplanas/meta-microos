SUMMARY = "Routines for dealing with data streams"
DESCRIPTION = "Routines for handling streaming data, including a set of generators \
for loading gzip data on the fly."
LICENSE = "MIT"

PV = "3.0.3"

RPM_NAME = "python311-jaraco.stream-3.0.3-2.1.noarch.rpm"
RPM_HASH = "72b814c394dc68d472c3f0e3591f880d721af709b6e889763fd1b049b8e520e1ec13211db608e787a8038b027c7bcdcc8897595007faacf23a92cbfa310bc147"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-jaraco.stream \
python311-jaraco.stream \
python3dist-jaraco.stream"

RDEPENDS:${PN} += "python-abi \
python311-more-itertools"

inherit rpm
