SUMMARY = "Documentation for texlive-spath3"
DESCRIPTION = "This package includes the documentation for texlive-spath3"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.7svn64818"

RPM_NAME = "texlive-spath3-doc-2023.201.2.7svn64818-57.1.noarch.rpm"
RPM_HASH = "5380b6f490ad4df297b9fe91b4e92bbfa1837b09d269707486a289c6d595ecf44c030ee7b8324ed218e3f6c6e7238b80fcd4f38275e56714d6af9868b2393c9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-spath3-doc"

RDEPENDS:${PN} += ""

inherit rpm
