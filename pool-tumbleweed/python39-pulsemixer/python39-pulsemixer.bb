SUMMARY = "pulsemixer - CLI and curses mixer for PulseAudio"
DESCRIPTION = "pulsemixer - CLI and curses mixer for PulseAudio"
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python39-pulsemixer-1.5.1-1.3.noarch.rpm"
RPM_HASH = "12c61fd9e0ae75b7b0b9a057a0127b4a9b0a490e7353c5945c9f70dc1b41536ecd5627104cd402ab98576c5c6e2364864a75b6cd92f5932e5ddb937e53b82ee5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pulsemixer \
python39-pulsemixer \
python3dist-pulsemixer"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh"

inherit rpm
