SUMMARY = "Fish completion for you-get"
DESCRIPTION = "Fish command line completion support for you-get."
LICENSE = "MIT"

PV = "0.4.1650"

RPM_NAME = "you-get-fish-completion-0.4.1650-1.4.noarch.rpm"
RPM_HASH = "f812fbf3d46b6fcfee6e55a82292627437d53c27fcc5e13752d237e81a390550ad6f9c958d662bcc4acc26e67d3acd8efef3b5d8849f9fad0df7bc3cdd1a05ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "you-get-fish-completion"

RDEPENDS:${PN} += "fish"

inherit rpm
