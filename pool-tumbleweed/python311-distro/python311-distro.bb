SUMMARY = "Linux Distribution - a Linux OS platform information API"
DESCRIPTION = "distro (for: Linux Distribution) provides information about the Linux distribution it runs on, such as a reliable machine-readable ID, or version information. \
 \
It is a renewed alternative implementation for Python's original platform.linux_distribution function, but it also provides much more functionality which isn't necessarily Python bound like a command-line interface."
LICENSE = "Apache-2.0"

PV = "1.8.0"

RPM_NAME = "python311-distro-1.8.0-2.3.noarch.rpm"
RPM_HASH = "19efb9f8429e2808a3e27049c6c174202a26956ad19535a24e7650971a2e315aca874fb2c66b0055a975b374312ae912267b116c6eb9b19c7ce69a9ee9eb79b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-distro \
python3.11dist-distro \
python311-distro \
python3dist-distro"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
