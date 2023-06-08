SUMMARY = "Bash Completion for alacritty"
DESCRIPTION = "The official bash completion script for alacritty. It includes support \
for every argument that can currently be passed to alacritty."
LICENSE = "Apache-2.0"

PV = "0.12.0"

RPM_NAME = "alacritty-bash-completion-0.12.0-1.1.noarch.rpm"
RPM_HASH = "55e300a31b699d38fb55f479cff757c87e60cd31be47371224d299e716ac55d841fb793ca1045dc8bb1d79c564a5760649b29aad5c819bf309d65851a9ae8e08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "alacritty-bash-completion"
RDEPENDS:${PN} += "bash-completion"

inherit rpm
