SUMMARY = "A replacement of the contextlib module"
DESCRIPTION = "Contexter is a full replacement of the contextlib standard library \
module."
LICENSE = "MIT"

PV = "0.1.4"

RPM_NAME = "python310-contexter-0.1.4-2.15.noarch.rpm"
RPM_HASH = "39ca34ced195d2379043e074b5e991ee75c54d7ffbf2cbeaa4a4588278181b2b46c55af44750141fb4dde4c54db57eb5e9bef852d32eca20f8bb6a2165aaa5f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-contexter \
python310-contexter \
python3dist-contexter"

RDEPENDS:${PN} += "python-abi"

inherit rpm
