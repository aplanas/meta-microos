SUMMARY = "Python tool to dump binary data"
DESCRIPTION = "This utility converts between the raw representation and a \
byte-based hexdump representation. \
 \
The display is equivalent to the output of the `hexdump -C` command, but \
it requires a Python runtime."
LICENSE = "Unlicense"

PV = "3.3"

RPM_NAME = "python310-hexdump-3.3-3.4.noarch.rpm"
RPM_HASH = "403089c60bb2ad9b0e54fb2654d66d1278c1cbf5cbf1c3185e63fa1f3564f232a92eeca20824114fbbd9339940b568edccc693f3b2559a8ef362b979a7483a69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-hexdump \
python310-hexdump \
python3dist-hexdump"

RDEPENDS:${PN} += "python-abi"

inherit rpm
