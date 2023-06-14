SUMMARY = "An intent parser"
DESCRIPTION = "A intent parser Python module. \
 \
Padaos converts a series of example sentences into one big chunk of \
regex. Each intent is a single compiled regex matcher."
LICENSE = "MIT"

PV = "0.1.10"

RPM_NAME = "python311-padaos-0.1.10-1.19.noarch.rpm"
RPM_HASH = "b84ec98aec1324502d14578deb8082713aa64b156692617457696712a7bcf20109b7e6f4dc428a972bdeae5dd1a496a6cd182611161a9bc2bbdec50f6a7740b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-padaos \
python311-padaos \
python3dist-padaos"

RDEPENDS:${PN} += "python-abi"

inherit rpm
