SUMMARY = "MIME email parser for KDE PIM"
DESCRIPTION = "This package provides libraries needed for the correct parsing of email \
messages."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "akonadi-mime-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "12ef327debc9cdc1f4bdc43b849f719810239991642edd7622bc73057784acace9cfa493c65af2d99299afdb19a9b399a8f131a42e74ef0deb2c28581e978e62"

RPROVIDES:${PN} += "akonadi-mime akonadi-mime(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
