SUMMARY = "Documentation for texlive-akletter"
DESCRIPTION = "This package includes the documentation for texlive-akletter"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5isvn15878"

RPM_NAME = "texlive-akletter-doc-2023.209.1.5isvn15878-55.1.noarch.rpm"
RPM_HASH = "7a9f79ef156d26907401f394c96e9bf9ef8c558821b0fb524204863d63fb1e97332c799d649a44ff417acda155dac1d72d77c985bf48c141dbe5621819c3eb25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-akletter-doc-de;en \
texlive-akletter-doc"

RDEPENDS:${PN} += ""

inherit rpm
