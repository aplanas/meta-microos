SUMMARY = "LDC Bash completion"
DESCRIPTION = "Optional dependency offering bash completion for ldc2"
LICENSE = "Artistic-1.0 & BSD-3-Clause"

PV = "1.32.0"

RPM_NAME = "ldc-bash-completion-1.32.0-1.2.aarch64.rpm"
RPM_HASH = "9fcdf3775ba30066604d2f5640b336afe1012d49015647a976ae49b746a72bf6cf8dd670a4ea5b209618db8a7f73cdd1596bbe182db9f04e681ed4e5fd0587d3"

RPROVIDES:${PN} += "ldc-bash-completion"

RDEPENDS:${PN} += "bash-completion \
ldc"

inherit rpm
