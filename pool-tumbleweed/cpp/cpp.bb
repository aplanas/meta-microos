SUMMARY = "The system GNU Preprocessor"
DESCRIPTION = "The system GNU Preprocessor."
LICENSE = "GPL-3.0-or-later"

PV = "13"

RPM_NAME = "cpp-13-1.3.aarch64.rpm"
RPM_HASH = "be9739daed5da5ee535f26321e209eaabc2c257a717ca0d8e4db1ce4fc7410bf36fceffba3b6612753e8e160e3f1a99e4153fe1930b02c117311f78a088f0b07"

RPROVIDES:${PN} += "cpp"

RDEPENDS:${PN} += "/usr/bin/sh \
cpp13"

inherit rpm
