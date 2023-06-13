SUMMARY = "Linux Distribution - a Linux OS platform information API"
DESCRIPTION = "distro (for: Linux Distribution) provides information about the Linux distribution it runs on, such as a reliable machine-readable ID, or version information. \
 \
It is a renewed alternative implementation for Python's original platform.linux_distribution function, but it also provides much more functionality which isn't necessarily Python bound like a command-line interface."
LICENSE = "Apache-2.0"

PV = "1.8.0"

RPM_NAME = "python39-distro-1.8.0-2.1.noarch.rpm"
RPM_HASH = "08b11cf620552279497041cd2fb5818f7ccb612c0678346b5d067b6b58bfa5939c3c6454d156b47010ef548fd9d6968becbfb07748f73127cc2792ddccd76705"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(distro) \
python39-distro \
python3dist(distro)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
update-alternatives"

inherit rpm
