SUMMARY = "Files to use compleat in the bash shell"
DESCRIPTION = " \
Contains a script that is automatically loaded by the bash shell on startup to \
setup the automatic completion by compleat."
LICENSE = "MIT"

PV = "1.0+git.20220402.ec8fccc"

RPM_NAME = "compleat-bash-1.0+git.20220402.ec8fccc-1.8.noarch.rpm"
RPM_HASH = "5884d1f9e65bc1de9e385a58b6a6733c47d0787e4756bda5fb27a2d1df74c1cc8c5c52dc3059887a3fae75d321f6238b584a9b9d8e2af88a57daf07497e38024"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "compleat-bash \
config-compleat-bash"

RDEPENDS:${PN} += "compleat"

inherit rpm
