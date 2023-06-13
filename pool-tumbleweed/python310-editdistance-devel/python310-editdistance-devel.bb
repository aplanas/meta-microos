SUMMARY = "Development files for python310-editdistance"
DESCRIPTION = "This package contains the files needed for binding the python310-editdistance C module."
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python310-editdistance-devel-0.6.2-1.4.aarch64.rpm"
RPM_HASH = "4a48d9b5caac8f305d1fb4fe9067dace413ebdc284de7d4b8fba444dd1d9b877367960126be833fc81fc48633604d5071b67107212d0b89537e01d2d41cd17c5"

RPROVIDES:${PN} += "python3-editdistance-devel \
python310-editdistance-devel \
python310-editdistance-devel(aarch-64)"

RDEPENDS:${PN} += "python310-base \
python310-editdistance"

inherit rpm
