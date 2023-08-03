SUMMARY = "Documentation for texlive-euflag"
DESCRIPTION = "This package includes the documentation for texlive-euflag"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.8svn55265"

RPM_NAME = "texlive-euflag-doc-2023.209.0.0.8svn55265-53.1.noarch.rpm"
RPM_HASH = "9b50d680245158642d493e6e84e19bace6282fef6c3401d06706f26dc63f62217f567c3bdc83f5e11845237ef73e72d6089d63e7b11a94820c63caa09cf3f0ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-euflag-doc"

RDEPENDS:${PN} += ""

inherit rpm
