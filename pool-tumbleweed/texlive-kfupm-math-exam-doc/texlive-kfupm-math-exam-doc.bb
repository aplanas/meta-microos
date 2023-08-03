SUMMARY = "Documentation for texlive-kfupm-math-exam"
DESCRIPTION = "This package includes the documentation for texlive-kfupm-math-exam"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.0svn63977"

RPM_NAME = "texlive-kfupm-math-exam-doc-2023.209.0.0.1.0svn63977-56.1.noarch.rpm"
RPM_HASH = "ad3aa17245eea482b14162704dfd0b70fe3b52703a54a66879ff6de30b8e884dcc2ead2643158e3368a7df24390bd700d4bd59081b9543fe41605413764e3eaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kfupm-math-exam-doc"

RDEPENDS:${PN} += ""

inherit rpm
