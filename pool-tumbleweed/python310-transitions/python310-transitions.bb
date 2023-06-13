SUMMARY = "A lightweight, object-oriented Python state machine implementation"
DESCRIPTION = "The transitions package makes it convenient and relatively easy to define and \
implement FSMs (finite state machines) in python."
LICENSE = "MIT"

PV = "0.8.10"

RPM_NAME = "python310-transitions-0.8.10-2.6.noarch.rpm"
RPM_HASH = "2f8889a25d42c370d2cc50ad97c862eb7edca098a2dbdc84c3a340d7f25596f7008bebb15c9b4f8fba4e872a09ec0eab8d727760ac3fbc638ede66a3f6167c72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-transitions \
python3.10dist(transitions) \
python310-transitions \
python3dist(transitions)"

RDEPENDS:${PN} += "python(abi) \
python310-six"

inherit rpm
