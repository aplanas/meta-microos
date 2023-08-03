SUMMARY = "Documentation for texlive-dashundergaps"
DESCRIPTION = "This package includes the documentation for texlive-dashundergaps"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0hsvn58150"

RPM_NAME = "texlive-dashundergaps-doc-2023.209.2.0hsvn58150-55.1.noarch.rpm"
RPM_HASH = "6cf5e4f5880dc5a8c1793b1ee6ad084f0105268fe3ad69b9645d46eed60e68d4a07a79078007a359bbb5627791bcac3b5d02941a31a5c82e029985dd36e55087"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dashundergaps-doc"

RDEPENDS:${PN} += ""

inherit rpm
