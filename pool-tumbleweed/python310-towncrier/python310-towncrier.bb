SUMMARY = "Building newsfiles for your project"
DESCRIPTION = "Building newsfiles for your project."
LICENSE = "MIT"

PV = "19.2.0"

RPM_NAME = "python310-towncrier-19.2.0-2.15.noarch.rpm"
RPM_HASH = "5f48036c9f53ca32d05fbb155ef441ec9fa9266e17a9a9bed1bed48fcad1b2fa8c7923770488782970045b72b7066c3c72cfe0e3f778985edbbae113200eb4ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-towncrier \
python310-towncrier \
python3dist-towncrier"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
git-core \
python-abi \
python310-Jinja2 \
python310-click \
python310-incremental \
python310-toml \
update-alternatives"

inherit rpm
