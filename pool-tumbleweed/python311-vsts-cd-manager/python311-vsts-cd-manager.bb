SUMMARY = "Python wrapper around some of the VSTS APIs"
DESCRIPTION = "Python wrapper around some of the VSTS APIs"
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python311-vsts-cd-manager-1.0.2-4.4.noarch.rpm"
RPM_HASH = "8b220ee7868b5f14bd9be2fc323a77c317e2fac221a7f3e5b53aca36d16e2d266a5fdc2302bcad1bfa574668286b7baa34f6f3846313564ae5d92dba8e3a7f93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(vsts-cd-manager) \
python311-vsts-cd-manager \
python3dist(vsts-cd-manager)"

RDEPENDS:${PN} += "python(abi) \
python311-msrest"

inherit rpm
