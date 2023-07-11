SUMMARY = "VCS-based management of project version strings [toml] extra"
DESCRIPTION = "Versioneer is a tool to automatically update version strings (in \
setup.py and the conventional ‘from PROJECT import _version’ pattern) \
by asking the version control system about the current tree. \
 \
This package provides the [toml] extra"
LICENSE = "Unlicense"

PV = "0.28"

RPM_NAME = "python39-versioneer-toml-0.28-1.3.noarch.rpm"
RPM_HASH = "2d17ad87b2dd65f1c560db05d7b72adb18f881659296aa205873b70292a21b26677803ee7c06ba6bdbbd7d28a916cb5a9a176f710bff8d108c6ae90253eb61e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-versioneer-toml"

RDEPENDS:${PN} += "python39-versioneer"

inherit rpm
