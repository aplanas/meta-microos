SUMMARY = "Check if your Manifest matches your distro"
DESCRIPTION = "Check if your Manifest matches your distro"
LICENSE = "Artistic-2.0"

PV = "1.43"

RPM_NAME = "perl-Test-CheckManifest-1.43-1.2.noarch.rpm"
RPM_HASH = "1510ea87fb1c11bd1fe11496a0bad9331880c1c67a41b5cde17a0aa892313e4d4c168db5e28710ff01aee6af7174f53543b3f5392db9762b63355d47e06b092a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--CheckManifest \
perl-Test-CheckManifest"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Cwd"

inherit rpm
