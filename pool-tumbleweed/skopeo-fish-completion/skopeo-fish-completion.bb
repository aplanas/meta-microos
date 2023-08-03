SUMMARY = "Fish completion for skopeo"
DESCRIPTION = "This package contains the fish completion for skopeo."
LICENSE = "Apache-2.0"

PV = "1.13.0"

RPM_NAME = "skopeo-fish-completion-1.13.0-1.1.noarch.rpm"
RPM_HASH = "c01c40674dbdf6e818c7b0b9c33eb04d3b9a1bef909d5a92e76ebf6371cb1ca561547272a117eb752ee68ea05531ff7ebbaa6009f85fd8171b12b2df59b58720"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "skopeo-fish-completion"

RDEPENDS:${PN} += "fish \
skopeo"

inherit rpm
