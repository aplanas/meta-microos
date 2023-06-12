SUMMARY = "Python tool to dump binary data"
DESCRIPTION = "This utility converts between the raw representation and a \
byte-based hexdump representation. \
 \
The display is equivalent to the output of the `hexdump -C` command, but \
it requires a Python runtime."
LICENSE = "Unlicense"

PV = "3.3"

RPM_NAME = "python311-hexdump-3.3-3.3.noarch.rpm"
RPM_HASH = "75293a784dd5c1e05168b144f0e8d900f58f3ba64ec88bf0eb613a795f321ee523fd436179c1464d9ba444fb69c95ff44a5c53c86461fc754386c173cb9eb614"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(hexdump) \
python311-hexdump \
python3dist(hexdump)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
