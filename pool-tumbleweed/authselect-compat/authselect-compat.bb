SUMMARY = "Tool to provide minimum backwards compatibility with authconfig"
DESCRIPTION = "This package will replace /usr/sbin/authconfig with a tool that will \
translate some of the authconfig calls into authselect calls. It provides \
only minimum backward compatibility and users are encouraged to migrate \
to authselect completely."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.0+git.0.2c30265"

RPM_NAME = "authselect-compat-1.4.0+git.0.2c30265-3.3.aarch64.rpm"
RPM_HASH = "360b0a9704b225ea7eee153a274913dcb5dfc027f3099eeddc283592787eb14b4f1595fdab4324a6864e9f80363b97e6a3661a9f85b2c79ef7052795cec63887"

RPROVIDES:${PN} += "authconfig \
authselect-compat"

RDEPENDS:${PN} += "/usr/bin/python3 \
authselect \
python-abi"

inherit rpm
