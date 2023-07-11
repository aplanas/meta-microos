SUMMARY = "Build root policy check scripts"
DESCRIPTION = "This package contains all suse scripts called in the \
build root checking or in parts implementing SUSE policies."
LICENSE = "GPL-2.0-or-later"

PV = "84.87+git20230324.8680ce4"

RPM_NAME = "brp-check-suse-84.87+git20230324.8680ce4-1.2.aarch64.rpm"
RPM_HASH = "924338b12af0618aca97db9e275acfbed699483355bcc83b4c0e68c6d8071663876ca1fcbaf32b96ecef66589745c15705b628229309fc460879ae9d7a2543d0"

RPROVIDES:${PN} += "brp-check-suse"

RDEPENDS:${PN} += "perl"

inherit rpm
