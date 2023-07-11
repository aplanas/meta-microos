SUMMARY = "Digital TV guide"
DESCRIPTION = "TV-Browser is Plugin based digital TV guide. Plugins can be installed with \
the download function of TV-Browser."
LICENSE = "GPL-3.0-or-later"

PV = "4.2.7"

RPM_NAME = "tvbrowser-4.2.7-1.3.noarch.rpm"
RPM_HASH = "e3ca49ab2010948d85738386b510bf3d262803081f2f9c89e63899ce65d028f5ea6124d1cfe51095b6aaf8d97ccd0d5402437f6926d8058c076c85c49251e3ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tvbrowser"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
java"

inherit rpm
