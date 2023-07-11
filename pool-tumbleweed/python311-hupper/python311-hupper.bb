SUMMARY = "An in-process file monitor"
DESCRIPTION = "Hupper is an integrated process monitor that will track changes to any \
imported Python files in sys.modules as well as custom paths. \
When files are changed the process is restarted."
LICENSE = "MIT"

PV = "1.10.3"

RPM_NAME = "python311-hupper-1.10.3-2.3.noarch.rpm"
RPM_HASH = "44357aee040642daa63f65b035e0fd5297f793eb7755584a8f87a60ce1c04f3a811409a2261a6670cc837649491dc3724a49f5f151415e068f9931fb9cb1029f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hupper \
python3.11dist-hupper \
python311-hupper \
python3dist-hupper"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-watchdog \
update-alternatives"

inherit rpm
