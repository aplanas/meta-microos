SUMMARY = "Documentation for texlive-debate"
DESCRIPTION = "This package includes the documentation for texlive-debate"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2.1svn64846"

RPM_NAME = "texlive-debate-doc-2023.209.0.0.2.1svn64846-53.1.noarch.rpm"
RPM_HASH = "4fcba50d53e94f58377014302061eae4376671adc703dbedc21461dd81362f0430bdf2ebcae67b1bbe1e3bb95a0ac4dc540a99869478782b1b00cf0921847648"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-debate-doc"

RDEPENDS:${PN} += ""

inherit rpm
