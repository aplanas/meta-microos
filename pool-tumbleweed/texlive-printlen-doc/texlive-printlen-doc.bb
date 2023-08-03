SUMMARY = "Documentation for texlive-printlen"
DESCRIPTION = "This package includes the documentation for texlive-printlen"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1asvn19847"

RPM_NAME = "texlive-printlen-doc-2023.209.1.1asvn19847-53.1.noarch.rpm"
RPM_HASH = "f8becc89a2e02f0b819e3517a9def95481d098d35aa300f9ee092ad4d2b7fa380770ceb32c51e6a02faa8e697842c449737d09ccfeb35ca40eeae2064ab0a7f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-printlen-doc"

RDEPENDS:${PN} += ""

inherit rpm
