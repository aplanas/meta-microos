SUMMARY = "Files to use compleat in the bash shell"
DESCRIPTION = " \
Contains a script that is automatically loaded by the bash shell on startup to \
setup the automatic completion by compleat."
LICENSE = "MIT"

PV = "1.0+git.20220402.ec8fccc"

RPM_NAME = "compleat-bash-1.0+git.20220402.ec8fccc-1.10.noarch.rpm"
RPM_HASH = "dd9de4a258c8e78116603a42748426c2055eb0b6de6bea56d3ac1363f64d4d492f71d1facb3a1b8cb942eea7aaa5463d68c8737d52f2af7aee6008a953dde2e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "compleat-bash \
config-compleat-bash"

RDEPENDS:${PN} += "compleat"

inherit rpm
