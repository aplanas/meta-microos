SUMMARY = "Patch and package update notification via mail"
DESCRIPTION = "patch2mail checks for available updates and sends a mail to root \
if any patches or updated packages (configureable) are available."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.2"

RPM_NAME = "patch2mail-1.1.2-4.10.noarch.rpm"
RPM_HASH = "36099c171747e4ef13ddb22347bcc25ff9925469bd04c847ef3efe88e17fbc28d8575901fe81e960bb1184abbe46092431405e526a847082f9232548dfd7e2e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "patch2mail"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/hostname \
/usr/bin/rm \
/usr/bin/sh \
/usr/bin/xsltproc \
cron \
grep \
mail \
mktemp \
zypper"

inherit rpm
