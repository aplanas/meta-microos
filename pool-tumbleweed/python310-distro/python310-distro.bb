SUMMARY = "Linux Distribution - a Linux OS platform information API"
DESCRIPTION = "distro (for: Linux Distribution) provides information about the Linux distribution it runs on, such as a reliable machine-readable ID, or version information. \
 \
It is a renewed alternative implementation for Python's original platform.linux_distribution function, but it also provides much more functionality which isn't necessarily Python bound like a command-line interface."
LICENSE = "Apache-2.0"

PV = "1.8.0"

RPM_NAME = "python310-distro-1.8.0-2.3.noarch.rpm"
RPM_HASH = "ebfc6b4f19b7830c0d9b7c5f3933393cf0c17f6c299f1bd50065caf5c72e26827ad487eaa4189cc14840cdd2b1a9d0658bb99c8ca431849e3238df32975d0cce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-distro \
python310-distro \
python3dist-distro"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
