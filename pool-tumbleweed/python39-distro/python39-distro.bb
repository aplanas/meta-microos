SUMMARY = "Linux Distribution - a Linux OS platform information API"
DESCRIPTION = "distro (for: Linux Distribution) provides information about the Linux distribution it runs on, such as a reliable machine-readable ID, or version information. \
 \
It is a renewed alternative implementation for Python's original platform.linux_distribution function, but it also provides much more functionality which isn't necessarily Python bound like a command-line interface."
LICENSE = "Apache-2.0"

PV = "1.8.0"

RPM_NAME = "python39-distro-1.8.0-2.3.noarch.rpm"
RPM_HASH = "ffd02dfc0f465c874583999faa6c9a53435a97672c724224944de8b7102a0f205edf2c043b21e00826762ed5b3be9dd4c6a8302c4523b22b178fdd08207516fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-distro \
python39-distro \
python3dist-distro"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
