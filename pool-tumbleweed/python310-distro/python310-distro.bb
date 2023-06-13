SUMMARY = "Linux Distribution - a Linux OS platform information API"
DESCRIPTION = "distro (for: Linux Distribution) provides information about the Linux distribution it runs on, such as a reliable machine-readable ID, or version information. \
 \
It is a renewed alternative implementation for Python's original platform.linux_distribution function, but it also provides much more functionality which isn't necessarily Python bound like a command-line interface."
LICENSE = "Apache-2.0"

PV = "1.8.0"

RPM_NAME = "python310-distro-1.8.0-2.1.noarch.rpm"
RPM_HASH = "9a9fd8cfc7b577b1d9fd1cf513695ffb16aeb6e6c304bc8f4765d76c05fe343d0e60678120404ef79633ea4645c3eac72097f6c28c1d49963446dc7119ec65ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-distro \
python3.10dist(distro) \
python310-distro \
python3dist(distro)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
update-alternatives"

inherit rpm
