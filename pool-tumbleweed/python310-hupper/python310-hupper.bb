SUMMARY = "An in-process file monitor"
DESCRIPTION = "Hupper is an integrated process monitor that will track changes to any \
imported Python files in sys.modules as well as custom paths. \
When files are changed the process is restarted."
LICENSE = "MIT"

PV = "1.10.3"

RPM_NAME = "python310-hupper-1.10.3-2.3.noarch.rpm"
RPM_HASH = "139c0304c7346d18ff1aefc5fddde53bd258d081729d22797dd39442eeaa7bc0ed664245e695017934c20888861b5d0b5247b572bdf1c4f80af8e8fd42973d23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-hupper \
python310-hupper \
python3dist-hupper"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-watchdog \
update-alternatives"

inherit rpm
