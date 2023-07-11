SUMMARY = "Bash completion for watson"
DESCRIPTION = "Bash command line completion support for watson."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "watson-bash-completion-2.1.0-1.5.noarch.rpm"
RPM_HASH = "af6bc6f1cbafd3774b8ac1968a1a02af40bbd1594c392b4355024e30a5d5b74481366a5dcd2cf256477496aec2476b01cddf4f119f0431b40c185bb5921ea9e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "watson-bash-completion"

RDEPENDS:${PN} += "watson"

inherit rpm
