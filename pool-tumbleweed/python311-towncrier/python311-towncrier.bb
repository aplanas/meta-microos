SUMMARY = "Building newsfiles for your project"
DESCRIPTION = "Building newsfiles for your project."
LICENSE = "MIT"

PV = "19.2.0"

RPM_NAME = "python311-towncrier-19.2.0-2.15.noarch.rpm"
RPM_HASH = "fed3b41d3080a3da2b579e4492d8128fdc019a06edc6f8f69d94f38949305d0695b63086f58fde98bfd96005c875263f8d81554fbfc2fdc6b8e51cc144073872"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-towncrier \
python3.11dist-towncrier \
python311-towncrier \
python3dist-towncrier"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
git-core \
python-abi \
python311-Jinja2 \
python311-click \
python311-incremental \
python311-toml \
update-alternatives"

inherit rpm
