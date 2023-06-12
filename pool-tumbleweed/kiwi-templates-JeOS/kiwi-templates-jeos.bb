SUMMARY = "KIWI - openSUSE Tumbleweed JeOS image templates"
DESCRIPTION = "This package contains system image templates to easily build \
a openSUSE Tumbleweed based operating system image with \
kiwi."
LICENSE = "MIT"

PV = "84.87"

RPM_NAME = "kiwi-templates-JeOS-84.87-18.1.noarch.rpm"
RPM_HASH = "ac0f8cd17e7eccdfd6bcf5631cab6a957811ac743bc16b1d6565977ea09a1a45596fe8264c957538dab7358e20daf479c35a086da8f8971113a01f7923869f28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kiwi-templates-JeOS"
RDEPENDS:${PN} += "python3-kiwi"

inherit rpm
