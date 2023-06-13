SUMMARY = "Documentation for texlive-clara"
DESCRIPTION = "This package includes the documentation for texlive-clara"
LICENSE = "OFL-1.1"

PV = "2023.201.svn54512"

RPM_NAME = "texlive-clara-doc-2023.201.svn54512-53.1.noarch.rpm"
RPM_HASH = "7b6d251cd9ae523502b082bb06b030c99b294136fceb716ec7e582b8d3ef9a1b9305178ecafd0df731171137edd6bc82fa7cc49e92616410dc0f9462c60c9c12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-clara-doc"

RDEPENDS:${PN} += ""

inherit rpm
