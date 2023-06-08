SUMMARY = "Fish completion for docker"
DESCRIPTION = "Fish command line completion support for docker."
LICENSE = "Apache-2.0"

PV = "23.0.5_ce"

RPM_NAME = "docker-fish-completion-23.0.5_ce-1.1.noarch.rpm"
RPM_HASH = "11f66bd607047f28a3fc8aadebe9d9b5128455d7d52158197e50224dde782927ed6550646e2820f775d5aac10442511866a1d0d1a056b2dba8e5bc5ce9ce42c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docker-fish-completion"
RDEPENDS:${PN} += "docker fish"

inherit rpm
