SUMMARY = "Function for capturing the outcome of Python function calls"
DESCRIPTION = "Outcome provides a function for capturing the outcome of a Python \
function call, so that it can be passed around."
LICENSE = "Apache-2.0 | MIT"

PV = "1.2.0"

RPM_NAME = "python39-outcome-1.2.0-3.1.noarch.rpm"
RPM_HASH = "251a82ec62726b0d8a354bad11f7017ab4190ccc63dcf2c367da0aa069da97d71e519fefc898b729118083b88ef92adbeeb12a3a7e8547548d6ca8fb7a21e8b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(outcome) \
python39-outcome \
python3dist(outcome)"
RDEPENDS:${PN} += "python(abi) \
python39-attrs"

inherit rpm
