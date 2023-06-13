SUMMARY = "German language files for bugzilla"
DESCRIPTION = "This package includes german language files for bugzilla"
LICENSE = "MPL-2.0"

PV = "5.0.6"

RPM_NAME = "bugzilla-lang-de-5.0.6-5.1.noarch.rpm"
RPM_HASH = "a95d736991cc6ccd34b814772a49818ffcdd9504cedca00146fe261b1013332a45d2d2d219a1c6894cd39ca8ede36ff053c5db655004bbcf2adb15b870c22dd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bugzilla-lang-de"

RDEPENDS:${PN} += "bugzilla"

inherit rpm
