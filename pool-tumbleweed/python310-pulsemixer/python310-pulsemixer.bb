SUMMARY = "pulsemixer - CLI and curses mixer for PulseAudio"
DESCRIPTION = "pulsemixer - CLI and curses mixer for PulseAudio"
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python310-pulsemixer-1.5.1-1.3.noarch.rpm"
RPM_HASH = "e9a2f241c60be072f8852d7c36bfcf5e5fe37ae23bb4a14adabfb84b6be40c4f093a95fd4203c3c63f4a1203fb97b2789050b8172ab8087d07897db000ef7db2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pulsemixer \
python310-pulsemixer \
python3dist-pulsemixer"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh"

inherit rpm
