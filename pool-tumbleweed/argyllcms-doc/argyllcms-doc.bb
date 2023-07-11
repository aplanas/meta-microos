SUMMARY = "Argyll CMS documentation"
DESCRIPTION = "The Argyll color management system supports accurate ICC profile creation for \
scanners, CMYK printers, film recorders and calibration and profiling of \
displays. \
 \
This package contains the Argyll color management system documentation."
LICENSE = "AGPL-3.0-only & GPL-2.0-or-later & MIT"

PV = "2.3.1"

RPM_NAME = "argyllcms-doc-2.3.1-2.6.aarch64.rpm"
RPM_HASH = "2c4b763866cc1f0b13e981fa83df95642967057e29f2de4d82a95fd38e624a7b93fd951f1b232d256be2ccdd34316a76e0c6c897ad4d2c2f27b0589e82a23670"

RPROVIDES:${PN} += "argyllcms-doc"

RDEPENDS:${PN} += "argyllcms"

inherit rpm
