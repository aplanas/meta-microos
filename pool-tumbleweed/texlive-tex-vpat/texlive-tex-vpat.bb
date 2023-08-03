SUMMARY = "TeX Accessibility Conformance Report"
DESCRIPTION = "TeX Accessibility Conformance Report based on ITI VPAT(R) \
guidelines. Currently it covers TeX Live. Other distributions \
can be added if needed."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1._june_2022svn63560"

RPM_NAME = "texlive-tex-vpat-2023.209.2.1._june_2022svn63560-55.1.noarch.rpm"
RPM_HASH = "20e7e66729b753ea2fdbcabdacb119e8eadc486e9f77e67824c75ae21666c748ebcb767c76c9c91dc100377fbb4d880120b43459ac92ab0aaad9536b180ba71b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tex-vpat"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
