SUMMARY = "Binary files of makedtx"
DESCRIPTION = "Binary files of makedtx"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn38769"

RPM_NAME = "texlive-makedtx-bin-2023.20230311.svn38769-93.1.aarch64.rpm"
RPM_HASH = "f1f33bc9887fef74437367f719276a419475071cb3a2d4a7cfbe121ab84c852db3199cf34464f6a67f58d2d89130ffa60afabb7726463314988bc27eb0371d2a"

RPROVIDES:${PN} += "texlive-makedtx-bin"

RDEPENDS:${PN} += "texlive-makedtx"

inherit rpm
