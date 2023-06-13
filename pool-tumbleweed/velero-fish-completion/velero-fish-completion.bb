SUMMARY = "Fish Completion for velero"
DESCRIPTION = "Fish command line completion support for velero."
LICENSE = "Apache-2.0"

PV = "1.9.2"

RPM_NAME = "velero-fish-completion-1.9.2-1.3.noarch.rpm"
RPM_HASH = "c9508767b769887c4f4f8b54a093a19d4fe521ae997620ef2d6314dd503c25cc53343c48aef559f758cf865e6777e64aace4c9e3de5a16790d653a601832e90c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "velero-fish-completion"

RDEPENDS:${PN} += "velero"

inherit rpm
