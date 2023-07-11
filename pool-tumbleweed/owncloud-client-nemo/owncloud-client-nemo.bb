SUMMARY = "Nemo overlay icons"
DESCRIPTION = "This package provides overlay icons to visualize the synchronization state \
in the Nemo file manager."
LICENSE = "GPL-2.0-only & GPL-3.0-only"

PV = "4.1.0"

RPM_NAME = "owncloud-client-nemo-4.1.0-1.1.aarch64.rpm"
RPM_HASH = "c3c210971984df2fa36051d856a6e293f7759a75932fae4c7806a3ac6dea28abeac17aea096477e565ad60b7ac51c5dc706738c55c219df042644fa1a038f374"

RPROVIDES:${PN} += "owncloud-client-nemo"

RDEPENDS:${PN} += "nemo \
owncloud-client \
python-nemo"

inherit rpm
