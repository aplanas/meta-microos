SUMMARY = "Check if your Manifest matches your distro"
DESCRIPTION = "Check if your Manifest matches your distro"
LICENSE = "Artistic-2.0"

PV = "1.43"

RPM_NAME = "perl-Test-CheckManifest-1.43-1.3.noarch.rpm"
RPM_HASH = "94b2fd540afc7dc6c402e424b94a49d26c51dff79f9b42c5a6afd20870cda6a59cbef1380f0865e0d5d5751f4b01fe6471fbc1b7ece33c63095dba01b08882fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--CheckManifest \
perl-Test-CheckManifest"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Cwd"

inherit rpm
