SUMMARY = "HTML documentation for systemd"
DESCRIPTION = "The HTML documentation for systemd."
LICENSE = "LGPL-2.1-or-later"

PV = "253.5"

RPM_NAME = "systemd-mini-doc-253.5-5.1.aarch64.rpm"
RPM_HASH = "b49a496077633cb67d291b7f9d5348e40a05411215628526da9499852ebf1aa43dc3318948a57748e3121aa8b9b23aa9db9e5676b4c2ddc70bc0765bccf1c7fd"

RPROVIDES:${PN} += "systemd-mini-doc"

RDEPENDS:${PN} += "this-is-only-for-build-envs"

inherit rpm
