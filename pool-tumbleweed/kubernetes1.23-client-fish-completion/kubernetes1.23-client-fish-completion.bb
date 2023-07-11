SUMMARY = "Fish Completion for kubernetes1.23-client"
DESCRIPTION = "Fish command line completion support for kubernetes1.23-client."
LICENSE = "Apache-2.0"

PV = "1.23.17"

RPM_NAME = "kubernetes1.23-client-fish-completion-1.23.17-5.1.noarch.rpm"
RPM_HASH = "1148a9444736e8b7699ca11da024447709ae68bd969ac3a3a500ca62055a3c34248fe979503bffb20a73e302cb28b357862ff9d93071ce62c2e338b5862f61ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-fish-completion \
kubernetes1.23-client-fish-completion"

RDEPENDS:${PN} += "kubernetes1.23-client"

inherit rpm
