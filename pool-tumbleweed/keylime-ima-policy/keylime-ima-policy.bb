SUMMARY = "IMA policy for Keylime agent"
DESCRIPTION = "Subpackage of rust-keylime to provide an suggested IMA policy for Keylime agent"
LICENSE = "Apache-2.0 & MIT"

PV = "0.2.1+git.1685699835.3c9d17c"

RPM_NAME = "keylime-ima-policy-0.2.1+git.1685699835.3c9d17c-2.1.aarch64.rpm"
RPM_HASH = "723f987e7db56fcd9e30ef297270caf7c03cf225d2b91523bbe5e91774e271aef4868d47f4810b4713dc850d2630484c8659c16600293c0193a9c74e3ce28b05"

RPROVIDES:${PN} += "config-keylime-ima-policy \
keylime-ima-policy"

RDEPENDS:${PN} += ""

inherit rpm
