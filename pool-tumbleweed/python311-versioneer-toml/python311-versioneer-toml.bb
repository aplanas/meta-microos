SUMMARY = "VCS-based management of project version strings [toml] extra"
DESCRIPTION = "Versioneer is a tool to automatically update version strings (in \
setup.py and the conventional ‘from PROJECT import _version’ pattern) \
by asking the version control system about the current tree. \
 \
This package provides the [toml] extra"
LICENSE = "Unlicense"

PV = "0.28"

RPM_NAME = "python311-versioneer-toml-0.28-1.3.noarch.rpm"
RPM_HASH = "90c4178551fae0804fb62732790b904dc816f3fceb29d6adce1a84ec16feca3ed2ba8f375579e7626a37e62e2a35e5ed93d7aca79777e7251c3519abd1c6a0ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-versioneer-toml \
python311-versioneer-toml"

RDEPENDS:${PN} += "python311-versioneer"

inherit rpm
