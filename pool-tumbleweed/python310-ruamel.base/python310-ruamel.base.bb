SUMMARY = "Shared ruamel routines"
DESCRIPTION = "This is a common package for the 'ruamel' namespace."
LICENSE = "MIT"

PV = "1.0.0+post1"

RPM_NAME = "python310-ruamel.base-1.0.0+post1-2.15.noarch.rpm"
RPM_HASH = "a0f159090622a0c85d330efd73db449c68ec6353e3ca9e8f19ce55f3635222995b124b776b9ea76214dd9b0cec25495959357a7f496e3b0c7ab676de05f510bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ruamel.base \
python310-ruamel.base \
python3dist-ruamel.base"

RDEPENDS:${PN} += "python-abi"

inherit rpm
