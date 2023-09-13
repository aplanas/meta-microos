SUMMARY = "Development files for murmurhash"
DESCRIPTION = "This subpackage contains header files for developing \
applications that want to make use of murmurhash."
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "python-murmurhash-devel-1.0.9-1.1.noarch.rpm"
RPM_HASH = "5a7de1b44367d38f362a95de4f246bdf0d807b4d48fa3bd82ce0b49fa9282f0142e602873cef298fb83090f2a900a8cb593716bdb1656e93824b30cd888bacb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-murmurhash-devel"

RDEPENDS:${PN} += ""

inherit rpm
