SUMMARY = "Enhanced version of 'wg show' showing peer names and online status"
DESCRIPTION = "Better wireguard status script \
 \
This script allows you to actually know, which peer in the `wg show` output is which by assigning them a name. \
Also you can see, which peers are actually online as `wg-info` will ping them and set the color (red/green) accordingly. \
To save time, this is done for all the peers in parallel. \
 \
The output is colored (if writing to a tty or explicitly requested) using terminal sequences, HTML or be just plain text."
LICENSE = "AGPL-3.0-or-later"

PV = "20230623.60ceb5c"

RPM_NAME = "wg-info-20230623.60ceb5c-1.1.noarch.rpm"
RPM_HASH = "4fa835db8a9bd6e4caf975bf8519b2da93d0300957280543f07c628aa54a3a74c787d31f4f5f459056c6961bb1a34505fd6a54aa3e5a62c66e5adb1b32c69268"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wg-info"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3 \
wireguard-tools"

inherit rpm
