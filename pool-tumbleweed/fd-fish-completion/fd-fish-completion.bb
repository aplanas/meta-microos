SUMMARY = "Fish Completion for fd"
DESCRIPTION = "The official fish completion script for fd, generated during the build."
LICENSE = "Apache-2.0 & MIT"

PV = "8.7.0"

RPM_NAME = "fd-fish-completion-8.7.0-1.4.noarch.rpm"
RPM_HASH = "5350ccce6f4a554070984b0306ed3811370d7ec99aba3ee86aafcf24de1709cd69bca00ae218e6b8f2232d46ddb3855f66730963c41c5c74771968e456e85423"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fd-fish-completion"

RDEPENDS:${PN} += ""

inherit rpm
