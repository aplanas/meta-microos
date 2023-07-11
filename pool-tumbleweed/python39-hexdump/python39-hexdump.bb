SUMMARY = "Python tool to dump binary data"
DESCRIPTION = "This utility converts between the raw representation and a \
byte-based hexdump representation. \
 \
The display is equivalent to the output of the `hexdump -C` command, but \
it requires a Python runtime."
LICENSE = "Unlicense"

PV = "3.3"

RPM_NAME = "python39-hexdump-3.3-3.4.noarch.rpm"
RPM_HASH = "aa136b7667d5444bac86ab3df85893c6a28280c93798097a323b659cc4cae8eefe8d4751ee1a006a6bf8cae000427430e5428d0c5108b1de7a282630cb3f1148"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-hexdump \
python39-hexdump \
python3dist-hexdump"

RDEPENDS:${PN} += "python-abi"

inherit rpm
