SUMMARY = "An in-process file monitor"
DESCRIPTION = "Hupper is an integrated process monitor that will track changes to any \
imported Python files in sys.modules as well as custom paths. \
When files are changed the process is restarted."
LICENSE = "MIT"

PV = "1.10.3"

RPM_NAME = "python39-hupper-1.10.3-1.4.noarch.rpm"
RPM_HASH = "ad5fe2a41e09e8b6f15864ca6daddd342c87370f97bedc50a58b73a50fd84b94cc4d6d74ab34083bc4258902e847f85122cafdf5aae49721277455bb7d752465"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-hupper \
python39-hupper \
python3dist-hupper"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-watchdog \
update-alternatives"

inherit rpm
