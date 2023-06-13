SUMMARY = "Documentation for texlive-icite"
DESCRIPTION = "This package includes the documentation for texlive-icite"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.3asvn54512"

RPM_NAME = "texlive-icite-doc-2023.201.1.3asvn54512-52.1.noarch.rpm"
RPM_HASH = "9e742bcc94b2ed2a0f21e893f5699e7b1ca03edfa2ef2c530e8c655194c6e259d3b85602ef8b950189cff476d553b848ed7c66e875af4d9504c10be3633006ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-icite-doc"

RDEPENDS:${PN} += ""

inherit rpm
