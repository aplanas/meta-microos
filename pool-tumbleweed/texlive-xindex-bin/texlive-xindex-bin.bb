SUMMARY = "Binary files of xindex"
DESCRIPTION = "Binary files of xindex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn49312"

RPM_NAME = "texlive-xindex-bin-2023.20230311.svn49312-92.1.aarch64.rpm"
RPM_HASH = "2fe77bdb512017914f8875af2a94466733784967e6ae75e154dac39fec1ece5e66d89aed638a90ad90c2da48b8777800b851f9371c41e7e7856a0c56cd57096a"

RPROVIDES:${PN} += "texlive-xindex-bin"

RDEPENDS:${PN} += "texlive-xindex"

inherit rpm
