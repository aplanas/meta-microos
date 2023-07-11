SUMMARY = "Fish Completion for yq"
DESCRIPTION = "Fish command line completion support for yq."
LICENSE = "MIT"

PV = "4.33.3"

RPM_NAME = "yq-fish-completion-4.33.3-1.3.noarch.rpm"
RPM_HASH = "434cfa68f7876a8cb938833bde9950cc2ee05e9082790b0fb4c3a0041223aa3d469a7cc46ef942012b6669fbf0d5a76121f35a7f53afa8569cfd51e49cfbf05e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yq-fish-completion"

RDEPENDS:${PN} += "yq"

inherit rpm
