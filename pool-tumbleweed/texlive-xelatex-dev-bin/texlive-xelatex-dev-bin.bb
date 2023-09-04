SUMMARY = "Binary files of xelatex-dev"
DESCRIPTION = "Binary files of xelatex-dev"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn53999"

RPM_NAME = "texlive-xelatex-dev-bin-2023.20230311.svn53999-93.2.aarch64.rpm"
RPM_HASH = "c3164b50de39a6089d48ed2d226eea1d19b69afcd935449881adcc43ec34c92a4a0481818bdd63253b39614d304d7f30f26f8ba5689356773baded6d1fb2c08a"

RPROVIDES:${PN} += "texlive-xelatex-dev-bin"

RDEPENDS:${PN} += "texlive-xelatex-dev"

inherit rpm
