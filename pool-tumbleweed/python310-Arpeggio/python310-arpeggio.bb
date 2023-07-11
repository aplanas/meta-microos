SUMMARY = "Packrat parser interpreter"
DESCRIPTION = "Arpeggio is a recursive descent parser with memoization based on PEG grammars \
(aka Packrat parser). \
 \
For a higher level parsing/language tool (i.e., a nicer interface to \
Arpeggio) see textX"
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-Arpeggio-2.0.0-3.5.noarch.rpm"
RPM_HASH = "b8e391e5246808eec999426ce074ff7a8cfa6c571888ec22527c965a8a57a84923e18387d29eeecd634c24dd43ffaaa7f9538fe11ef5f068eb16248b31ebbfab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-arpeggio \
python310-Arpeggio \
python3dist-arpeggio"

RDEPENDS:${PN} += "python-abi"

inherit rpm
