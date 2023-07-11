SUMMARY = "Importing Python modules by physical file path"
DESCRIPTION = "Importing Python modules by physical file path."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "python310-magicalimport-0.9.1-2.10.noarch.rpm"
RPM_HASH = "816c19a0bcfd26a1e1736c5f971f1e057df81043c60c2d613d006c188669f840bf91c00edd252327b7c9f1fcedd0de449bc0477cfc98fac6fbe183eaf6c545de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-magicalimport \
python310-magicalimport \
python3dist-magicalimport"

RDEPENDS:${PN} += "python-abi"

inherit rpm
