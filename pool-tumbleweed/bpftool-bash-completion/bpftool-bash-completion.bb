SUMMARY = "Bash completion for bpftool"
DESCRIPTION = "bash command line completion support for bpftool."
LICENSE = "GPL-2.0-only"

PV = "7.2.0"

RPM_NAME = "bpftool-bash-completion-7.2.0-1.2.aarch64.rpm"
RPM_HASH = "007e6fa492f2c70b02cd5f717d1da357d2d3b45457d6cebc791431596b3501162672d0766f3ebfcea9c69d835bfb1c3baf84f435955f7fb0a315e2f90c50473b"

RPROVIDES:${PN} += "bpftool-bash-completion"

RDEPENDS:${PN} += "bash-completion \
bpftool"

inherit rpm
