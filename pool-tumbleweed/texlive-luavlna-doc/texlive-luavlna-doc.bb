SUMMARY = "Documentation for texlive-luavlna"
DESCRIPTION = "This package includes the documentation for texlive-luavlna"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.1jsvn64142"

RPM_NAME = "texlive-luavlna-doc-2023.208.0.0.1jsvn64142-53.1.noarch.rpm"
RPM_HASH = "a653a0972274665385ef160988b6eb31069b59db27b4f0abcdcb8d01daaa7adb121b8ba567f393e9b35ed714320efe6b4577d955d7f28fb4a2b2283ea3903fd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luavlna-doc"

RDEPENDS:${PN} += ""

inherit rpm
