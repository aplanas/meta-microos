SUMMARY = "Packrat parser interpreter"
DESCRIPTION = "Arpeggio is a recursive descent parser with memoization based on PEG grammars \
(aka Packrat parser). \
 \
For a higher level parsing/language tool (i.e., a nicer interface to \
Arpeggio) see textX"
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-Arpeggio-2.0.0-3.3.noarch.rpm"
RPM_HASH = "dd507eabaeee4499c26e29644bb24ca71a5b96cb9f20c87ec7ac9282c4e97136d7d5ba12b1cdc25e6245de0337b5d135046c3a630d90d95011eee91c59f75a2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(arpeggio) \
python311-Arpeggio \
python3dist(arpeggio)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
