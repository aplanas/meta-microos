SUMMARY = "Binary files of fragmaster"
DESCRIPTION = "Binary files of fragmaster"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn13663"

RPM_NAME = "texlive-fragmaster-bin-2023.20230311.svn13663-91.1.aarch64.rpm"
RPM_HASH = "e1e06e547b39c362e115966f0c76562c0640769056077eee61cf1761ef93a879bbdcc10d89370db0da78a2a036f32c6ce0e18a9babed0acb3b7db05b68912182"

RPROVIDES:${PN} += "texlive-fragmaster-bin \
texlive-fragmaster-bin(aarch-64)"

RDEPENDS:${PN} += "texlive-fragmaster"

inherit rpm
