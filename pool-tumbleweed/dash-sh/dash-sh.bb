SUMMARY = "Handle behaviour of /bin/sh"
DESCRIPTION = "Use dash as /bin/sh implementation."
LICENSE = "BSD-3-Clause"

PV = "0.5.12"

RPM_NAME = "dash-sh-0.5.12-2.2.noarch.rpm"
RPM_HASH = "b6668a9e94afbb6de90fc8b65174f8365a7359567bd97f600228066afe615e08aebc186ac2a7797bd2601fc23b4a47cd7ab259a976c4d38cac845a724843604b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/bin/sh \
alternative(sh) \
dash-sh"
RDEPENDS:${PN} += "dash"

inherit rpm
