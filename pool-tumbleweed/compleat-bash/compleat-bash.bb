SUMMARY = "Files to use compleat in the bash shell"
DESCRIPTION = " \
Contains a script that is automatically loaded by the bash shell on startup to \
setup the automatic completion by compleat."
LICENSE = "MIT"

PV = "1.0+git.20220402.ec8fccc"

RPM_NAME = "compleat-bash-1.0+git.20220402.ec8fccc-1.9.noarch.rpm"
RPM_HASH = "063a3e088c479f53fcdde12e0fb2931b37c7e082ba62e3e34a781c77fcc77c446962698d44bfcb0c260e60681b03f8628670a0e9a44eec25184166e70496d7ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "compleat-bash \
config-compleat-bash"

RDEPENDS:${PN} += "compleat"

inherit rpm
