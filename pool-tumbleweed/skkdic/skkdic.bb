SUMMARY = "Main Dictionary for SKK"
DESCRIPTION = "main dictionary for SKK"
LICENSE = "GPL-2.0-or-later & SUSE-Permissive & SUSE-Public-Domain"

PV = "20160304"

RPM_NAME = "skkdic-20160304-3.10.noarch.rpm"
RPM_HASH = "6a48d433f9249d9c600a3f8a3762101811873a1edf41fb9499c251081ee3a45bcd78c5fe5e477f094aa2ec0f6eb931e02eb23d34e689a7a20fc83998a978669c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(scim-skk:ja) \
skkdic"

RDEPENDS:${PN} += "info"

inherit rpm
