SUMMARY = "HTML documentation for systemd"
DESCRIPTION = "The HTML documentation for systemd."
LICENSE = "LGPL-2.1-or-later"

PV = "253.7"

RPM_NAME = "systemd-mini-doc-253.7-2.1.aarch64.rpm"
RPM_HASH = "5aae5c0ec82b65519c7ba7d1c8f17b2f681dba873e71da7765a8b7adeed779a8bfa3827f6da3407d13b4e615c970704826ebede753bb72177b068c8d151155bb"

RPROVIDES:${PN} += "systemd-mini-doc"

RDEPENDS:${PN} += "this-is-only-for-build-envs"

inherit rpm
