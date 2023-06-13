SUMMARY = "authres - Authentication Results Header Module"
DESCRIPTION = "authres - Authentication Results Header Module"
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "python39-authres-1.2.0-1.13.noarch.rpm"
RPM_HASH = "73948e167ce4398a4f2fef63ce333e90899df4828eb0219b900613a3739e258e429d10f8bbea99598ce1c6ad8746a82b4e77217e7d0adda4088091cfefbf95c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(authres) \
python39-authres \
python3dist(authres)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
