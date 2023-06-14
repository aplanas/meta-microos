SUMMARY = "Tool to scan for hidden files on HTTP servers"
DESCRIPTION = "A tool that looks for files accessible on web servers that shouldn't be public \
and can pose a security risk. \
 \
Typical examples include publicly accessible git repositories, backup files \
potentially containing passwords or database dumps. In addition, it contains \
a few checks for other security vulnerabilities."
LICENSE = "CC0-1.0"

PV = "0.0.12"

RPM_NAME = "snallygaster-0.0.12-1.6.noarch.rpm"
RPM_HASH = "cadfda516a03fc0e403d1efa1843f0a23ff4dd4b21b2f1b449db58cdfa09aabd8743197689ce64ed237c1d644bd5cc000b051f5ec3882c57e161357dffefb99f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-snallygaster \
python3dist-snallygaster \
snallygaster"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-beautifulsoup4 \
python3-dnspython \
python3-urllib3"

inherit rpm
