SUMMARY = "An in-process file monitor"
DESCRIPTION = "Hupper is an integrated process monitor that will track changes to any \
imported Python files in sys.modules as well as custom paths. \
When files are changed the process is restarted."
LICENSE = "MIT"

PV = "1.10.3"

RPM_NAME = "python39-hupper-1.10.3-2.3.noarch.rpm"
RPM_HASH = "ef21389bcd712c16c2f54b2ab0d11f9bed05fd8c5f1b7b77e2d71a7ccab38be85b877469427d79bb004539c3fb91caec30874c71300ff67b02c30f5a80dd37bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-hupper \
python39-hupper \
python3dist-hupper"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-watchdog \
update-alternatives"

inherit rpm
