SUMMARY = "Translations for package kid3-core"
DESCRIPTION = "Provides translations for the 'kid3-core' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.9.3"

RPM_NAME = "kid3-core-lang-3.9.3-1.4.noarch.rpm"
RPM_HASH = "733f1a3f208de6312a6dba53f99fdd8d43128e76ae471243701413db6c20c3cf6a3e2943e0d780d6de5bee3573c34dc194f4d5bc0ca312a9acd917aea56f8111"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kid3-core-lang \
kid3-core-lang-all"

RDEPENDS:${PN} += "kid3-core"

inherit rpm
