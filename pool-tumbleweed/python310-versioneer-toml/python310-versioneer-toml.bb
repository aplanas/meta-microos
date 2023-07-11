SUMMARY = "VCS-based management of project version strings [toml] extra"
DESCRIPTION = "Versioneer is a tool to automatically update version strings (in \
setup.py and the conventional ‘from PROJECT import _version’ pattern) \
by asking the version control system about the current tree. \
 \
This package provides the [toml] extra"
LICENSE = "Unlicense"

PV = "0.28"

RPM_NAME = "python310-versioneer-toml-0.28-1.3.noarch.rpm"
RPM_HASH = "f7f8de96dddf97b9d7b31aa125614f561f391400ec6c6c9fe5f2c04f417fbec55e60415f206cb4a7ac9ebed2b4a634c0576b2d22f9ca10dd59b5844788f737bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-versioneer-toml"

RDEPENDS:${PN} += "python310-versioneer"

inherit rpm
