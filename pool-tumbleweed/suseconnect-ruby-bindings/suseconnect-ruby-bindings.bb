SUMMARY = "Ruby bindings for libsuseconnect library"
DESCRIPTION = "This package provides bindings needed to use libsuseconnect from Ruby scripts."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.0~git2.f42b4b2a060e"

RPM_NAME = "suseconnect-ruby-bindings-1.1.0~git2.f42b4b2a060e-1.1.aarch64.rpm"
RPM_HASH = "245f4b26c8338f0c605653f474c6516daab44fd1adfaa35223ed572a0103747649fa8276be550a73743fa614799be98ac540c909cb67d4047bf967ddb790e879"

RPROVIDES:${PN} += "suseconnect-ruby-bindings"

RDEPENDS:${PN} += "libsuseconnect"

inherit rpm
