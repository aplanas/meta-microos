SUMMARY = "Binary files of mptopdf"
DESCRIPTION = "Binary files of mptopdf"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn18674"

RPM_NAME = "texlive-mptopdf-bin-2023.20230311.svn18674-91.1.aarch64.rpm"
RPM_HASH = "a2f4fffe2c7b82cdd73908b69c93cfd5297a7df3b49e247475521abe1fff77f66781fa89f911d39f97d7da35b78bd59268d0e477b741772f2c12213804deee10"

RPROVIDES:${PN} += "texlive-mptopdf-bin"

RDEPENDS:${PN} += "texlive-mptopdf"

inherit rpm
