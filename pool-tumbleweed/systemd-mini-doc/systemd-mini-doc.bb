SUMMARY = "HTML documentation for systemd"
DESCRIPTION = "The HTML documentation for systemd."
LICENSE = "LGPL-2.1-or-later"

PV = "253.4"

RPM_NAME = "systemd-mini-doc-253.4-2.1.aarch64.rpm"
RPM_HASH = "7e9c0acdd08c9915d098deef5ffdf9d94900efb26afc6ac965388146dab9a588297bbfba029a192bf556425e39b5b3a1fd05a820c1d31902223e7b7125d6df67"

RPROVIDES:${PN} += "systemd-mini-doc \
systemd-mini-doc(aarch-64)"

RDEPENDS:${PN} += "this-is-only-for-build-envs"

inherit rpm
