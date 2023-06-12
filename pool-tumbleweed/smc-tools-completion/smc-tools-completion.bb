SUMMARY = "Bash completion for smc-tools"
DESCRIPTION = "This package contains the files to enable command completion for the \
smc-tools package when running a bash shell."
LICENSE = "EPL-1.0"

PV = "1.8.2"

RPM_NAME = "smc-tools-completion-1.8.2-1.2.aarch64.rpm"
RPM_HASH = "59fa8de91d2a18ed64982ead90dd77485717c81f0cdb7ecb2f6efbe872ec9017ba5b61bd9a4e97837927503b76beda57a7ce3a642d9f35cb5d8cc243aaa219c4"

RPROVIDES:${PN} += "smc-tools-completion \
smc-tools-completion(aarch-64)"
RDEPENDS:${PN} += "bash-completion \
smc-tools"

inherit rpm
