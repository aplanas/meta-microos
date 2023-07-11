SUMMARY = "Binary files of texfot"
DESCRIPTION = "Binary files of texfot"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn33155"

RPM_NAME = "texlive-texfot-bin-2023.20230311.svn33155-92.1.aarch64.rpm"
RPM_HASH = "1588c9939818c583bceacf5e8b9e94e867e8964d53f56b9bd44a697842f4e0cbfe77a9ea81b8be11ed4bfe83e89542ebc788f85d132f79cb2f28b39ca72b988e"

RPROVIDES:${PN} += "texlive-texfot-bin"

RDEPENDS:${PN} += "texlive-texfot"

inherit rpm
