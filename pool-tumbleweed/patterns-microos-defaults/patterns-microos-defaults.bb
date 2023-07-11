SUMMARY = "openSUSE MicroOS defaults"
DESCRIPTION = "This provides default packages for openSUSE MicroOS which can be optionally \
replaced by alternatives."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-defaults-5.0-72.1.aarch64.rpm"
RPM_HASH = "50f93765e90b55544624af554b95bb244b1b9f8b7b0e941b64f410619372cec011c2625d195eba477dcffbbafb04f80321d14addbbc7bdbfa7866aea06aa4071"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
patterns-microos-defaults"

RDEPENDS:${PN} += "audit \
pattern- \
systemd-coredump"

inherit rpm
