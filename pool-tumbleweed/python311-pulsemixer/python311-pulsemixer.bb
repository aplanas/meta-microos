SUMMARY = "pulsemixer - CLI and curses mixer for PulseAudio"
DESCRIPTION = "pulsemixer - CLI and curses mixer for PulseAudio"
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python311-pulsemixer-1.5.1-1.3.noarch.rpm"
RPM_HASH = "0fbba447ba93a930d7552bfb634c3d236ed06724b5cc835544a6726d5115af86b1c01ab770177c4dffe3d5fdbc132afbd435e5ebaa1a88df4f74684d051e18d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pulsemixer \
python3.11dist-pulsemixer \
python311-pulsemixer \
python3dist-pulsemixer"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh"

inherit rpm
