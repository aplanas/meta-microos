SUMMARY = "Additional Appstream Metadata"
DESCRIPTION = "This package contains extra appstream metadata to be used by appstream-builder"
LICENSE = "CC0-1.0"

PV = "1.0.1+git.20230117"

RPM_NAME = "openSUSE-appdata-extra-1.0.1+git.20230117-2.1.noarch.rpm"
RPM_HASH = "8c4621d600eb2f0fddadb65372a519c90d4b869aa1f34280c6f7e2ba366a142f0b576868c50ea23603f2f3a9eb308e36ea06e0487d65551c339696634780dd7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openSUSE-appdata-extra"

RDEPENDS:${PN} += ""

inherit rpm
