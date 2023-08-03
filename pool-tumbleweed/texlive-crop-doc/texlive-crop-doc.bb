SUMMARY = "Documentation for texlive-crop"
DESCRIPTION = "This package includes the documentation for texlive-crop"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.10.2svn55424"

RPM_NAME = "texlive-crop-doc-2023.209.1.10.2svn55424-55.1.noarch.rpm"
RPM_HASH = "18783a2884b1354936e0351fcf9aa9dc8769a72185c029640ad60e131575390648e470e6f975001713adc12e7e16ee0bc7810a57271310a2e81e84705a7cf109"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-crop-doc"

RDEPENDS:${PN} += ""

inherit rpm
