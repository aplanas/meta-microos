SUMMARY = "Documentation for texlive-sauerj"
DESCRIPTION = "This package includes the documentation for texlive-sauerj"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-sauerj-doc-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "51131b89f23834d66601c83094e6f7e9099013ee755ce7fb42563bd432d6285930990636be2884da6e6e9d449d68fa68577aa60f4379e15dab182d474286200f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sauerj-doc"

RDEPENDS:${PN} += ""

inherit rpm
