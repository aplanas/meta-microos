SUMMARY = "An English words dictionary"
DESCRIPTION = "This package contains an English words dictionary which will be installed as \
 \
/usr/share/dict/american and linked to /usr/share/dict/words \
 \
The symbolic link may be used by look(1) and ispell(1). \
 \
For a British or Canadian version of such a words dictionary you may install \
words-british or words-canadian respectively."
LICENSE = "SUSE-Public-Domain"

PV = "2020.12.07"

RPM_NAME = "words-2020.12.07-2.1.noarch.rpm"
RPM_HASH = "01e781fd05bbd8d265a26ecee375a6d3eb6edce2186c4759ff417eab00e9d36a018a6b632ab93e4f7b31e7aa34c7526baca2819dd214d3f883248b478fbdc64c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "scowl \
words"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
fillup"

inherit rpm
