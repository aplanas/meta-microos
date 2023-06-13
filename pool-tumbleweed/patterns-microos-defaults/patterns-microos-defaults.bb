SUMMARY = "openSUSE MicroOS defaults"
DESCRIPTION = "This provides default packages for openSUSE MicroOS which can be optionally \
replaced by alternatives."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-defaults-5.0-70.1.aarch64.rpm"
RPM_HASH = "04aa52f0a394b6490adb1405ef3acc7a5e45c0c4cc363c984bda1ab6745dc1963a0c92da6e56783aa7348365d18197afa687cca9490a6011cd1856178a346c9d"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-order() \
patterns-microos-defaults \
patterns-microos-defaults(aarch-64)"

RDEPENDS:${PN} += "audit \
pattern() \
systemd-coredump"

inherit rpm
