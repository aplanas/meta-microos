SUMMARY = "System user and group mail"
DESCRIPTION = "This package provides the system account and group 'mail'."
LICENSE = "MIT"

PV = "20170617"

RPM_NAME = "system-user-mail-20170617-24.14.noarch.rpm"
RPM_HASH = "e10b344318080b1707e867a9b30eeb17a3b7b15daf48a1c1334d718496b356d9b1ba0c9fae182d96e52733697643fddc6b571b4f006303e33a964fd399410307"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group(mail) \
system-user-mail \
user(mail)"

RDEPENDS:${PN} += "/bin/sh \
sysuser-shadow"

inherit rpm
