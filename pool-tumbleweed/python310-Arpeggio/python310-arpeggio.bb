SUMMARY = "Packrat parser interpreter"
DESCRIPTION = "Arpeggio is a recursive descent parser with memoization based on PEG grammars \
(aka Packrat parser). \
 \
For a higher level parsing/language tool (i.e., a nicer interface to \
Arpeggio) see textX"
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python310-Arpeggio-2.0.2-1.1.noarch.rpm"
RPM_HASH = "36264102508ff1caca6de25d2533b73cc23b8fe0eb468c48b614ae1790a1ce71de14242bae5589510df95e29ace73e929416f95c2ea7a154c0f8a94dc362c05d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-arpeggio \
python310-Arpeggio \
python3dist-arpeggio"

RDEPENDS:${PN} += "python-abi"

inherit rpm
