SUMMARY = "A pytest plugin that limits the output to just the things you need"
DESCRIPTION = "A pytest plugin that limits the output to just the things you need."
LICENSE = "BSD-3-Clause"

PV = "0.2.5"

RPM_NAME = "python311-pytest-tldr-0.2.5-1.3.noarch.rpm"
RPM_HASH = "88eb57ba040399dd46fe40b3d7f99c250bd8e79e8bfc13156cece98eda335b3310d48e48da460866e26e748b53736e62e9d49a08eb9be4be62f23b6a3fee3822"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pytest-tldr \
python311-pytest-tldr \
python3dist-pytest-tldr"

RDEPENDS:${PN} += "python-abi \
python311-pytest"

inherit rpm
