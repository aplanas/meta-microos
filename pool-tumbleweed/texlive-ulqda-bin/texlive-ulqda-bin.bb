SUMMARY = "Binary files of ulqda"
DESCRIPTION = "Binary files of ulqda"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn13663"

RPM_NAME = "texlive-ulqda-bin-2023.20230311.svn13663-91.1.aarch64.rpm"
RPM_HASH = "10184bedacb7359fc39acaf720945651ba547dddd2b2fa7404e11da65df8076538ec3415035d4ca30dd49e347b6d938de33d85751d9aa0046f746849c1d4d021"

RPROVIDES:${PN} += "texlive-ulqda-bin \
texlive-ulqda-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-ulqda"

inherit rpm
