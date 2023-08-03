SUMMARY = "Documentation for texlive-econlipsum"
DESCRIPTION = "This package includes the documentation for texlive-econlipsum"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.8.2svn58390"

RPM_NAME = "texlive-econlipsum-doc-2023.209.0.0.8.2svn58390-54.1.noarch.rpm"
RPM_HASH = "28751ad0aa17e7931d5cb8acfeac96bff4f7fb25ff0d43a73db34bc08b0f31bce44eed25347dc18c9f39faf9ed143f522da6454b5ec3592570c7c741f2ec1844"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-econlipsum-doc"

RDEPENDS:${PN} += ""

inherit rpm
