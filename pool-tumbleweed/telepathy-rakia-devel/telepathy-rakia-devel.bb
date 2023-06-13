SUMMARY = "SIP connection manager for Telepathy - development files"
DESCRIPTION = "IETF SIP connection manager for Telepathy using the SofiaSIP protocol \
stack."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.0"

RPM_NAME = "telepathy-rakia-devel-0.8.0-5.12.aarch64.rpm"
RPM_HASH = "83a5900a764ef22d549242e2009aca63a56aef48f76c335e790e06f65602c8b6b86e398a951fe1f9f9a06ab4868c8b5a9e604c5701485ae2481b13cf91c20680"

RPROVIDES:${PN} += "telepathy-rakia-devel \
telepathy-rakia-devel(aarch-64)"

RDEPENDS:${PN} += "telepathy-rakia"

inherit rpm
