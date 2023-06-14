SUMMARY = "Tool to provide minimum backwards compatibility with authconfig"
DESCRIPTION = "This package will replace /usr/sbin/authconfig with a tool that will \
translate some of the authconfig calls into authselect calls. It provides \
only minimum backward compatibility and users are encouraged to migrate \
to authselect completely."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.0+git.0.2c30265"

RPM_NAME = "authselect-compat-1.4.0+git.0.2c30265-3.2.aarch64.rpm"
RPM_HASH = "9c5f56aec9bd82a4b7c019713d617ba6ed8f3cecb9142fb0e1f7f8a332054e7bc2b5e2d5b34ca76e1254f729ea47339e823ea1a88ba753da75234f9741fb19ed"

RPROVIDES:${PN} += "authconfig \
authselect-compat"

RDEPENDS:${PN} += "/usr/bin/python3 \
authselect \
python-abi"

inherit rpm
