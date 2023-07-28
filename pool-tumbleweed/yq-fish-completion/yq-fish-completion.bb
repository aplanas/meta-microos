SUMMARY = "Fish Completion for yq"
DESCRIPTION = "Fish command line completion support for yq."
LICENSE = "MIT"

PV = "4.34.2"

RPM_NAME = "yq-fish-completion-4.34.2-1.1.noarch.rpm"
RPM_HASH = "e81a8d79c92620e126dd26d018940c62e59f9257d0bd01cf9e26525c9d2945bbf1269d79b7276d05d61cef4de3b4ef67bd918f6bf6a0011125d9ed8087a097ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yq-fish-completion"

RDEPENDS:${PN} += "yq"

inherit rpm
